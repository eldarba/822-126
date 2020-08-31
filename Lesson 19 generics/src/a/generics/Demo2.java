package a.generics;

import java.util.ArrayList;
import java.util.List;

import b.generics.animals.Animal;
import b.generics.animals.Cow;
import b.generics.animals.Lion;
import b.generics.animals.Mammal;

public class Demo2 {

	public static void main(String[] args) {

		List<Object> objects = new ArrayList<>();
		List<Animal> animals = new ArrayList<>();
		List<Mammal> mammals = new ArrayList<>();
		List<Lion> lions = new ArrayList<>();
		List<Cow> cows = new ArrayList<>();

		m1Mammals(mammals);

		m2Any(objects);
		m2Any(animals);
		m2Any(mammals);
		m2Any(lions);
		m2Any(cows);

		m3ExtendsMammal(mammals);
		m3ExtendsMammal(lions);
		m3ExtendsMammal(cows);

		m4SuperToMammal(mammals);
		m4SuperToMammal(animals);
		m4SuperToMammal(objects);
	}

	public static void m1Mammals(List<Mammal> list) {
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

	public static void m2Any(List<?> list) {
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

	public static void m3ExtendsMammal(List<? extends Mammal> list) {
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

	public static void m4SuperToMammal(List<? super Mammal> list) {
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
