package a.generics;

import java.util.ArrayList;
import java.util.List;

import b.generics.animals.Animal;
import b.generics.animals.Cow;
import b.generics.animals.Lion;
import b.generics.animals.Mammal;

public class Demo2 {

	public static void main(String[] args) {
		List<Mammal> mammals = new ArrayList<>();
		List<Lion> lions = new ArrayList<>();
		m1(mammals);
		m2(lions);
	}

	public static void m1(List<Mammal> list) {
		// add elements
		Mammal mammal = new Mammal();
		Lion lion = new Lion();
		Cow cow = new Cow();
		list.add(mammal);
		list.add(lion);
		list.add(cow);
		// get element
		Mammal m = list.get(0);
		System.out.println(m);
	}

	public static void m2(List<?> list) {
		// NO add elements
		Mammal mammal = new Mammal();
		Lion lion = new Lion();
		Cow cow = new Cow();
//		list.add(mammal);
//		list.add(lion);
//		list.add(cow);
		// get element - returns Object
		Object m = list.get(0);
		System.out.println(m);
	}

	public static void m3(List<? extends Mammal> list) {
		// NO add elements
		Mammal mammal = new Mammal();
		Lion lion = new Lion();
		Cow cow = new Cow();
//		list.add(mammal);
//		list.add(lion);
//		list.add(cow);
		// get element returns Mammal
		Mammal m = list.get(0);
		System.out.println(m);
	}

	public static void m4(List<? super Mammal> list) {
		// add elements works (for Mammal and down)
		Mammal mammal = new Mammal();
		Lion lion = new Lion();
		Cow cow = new Cow();
		Animal animal = new Animal();
		list.add(mammal);
		list.add(lion);
		list.add(cow);
//		list.add(animal);
		// get element returns object
		Object m = list.get(0);
		System.out.println(m);
	}

}
