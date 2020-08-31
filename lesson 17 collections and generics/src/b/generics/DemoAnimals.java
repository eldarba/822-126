package b.generics;

import java.util.List;

import b.generics.animals.Cow;
import b.generics.animals.Lion;
import b.generics.animals.Mammal;

public class DemoAnimals {

	public static void main(String[] args) {

	}

	// explicit type argument
	public static void m1(List<Mammal> list) {
		// get
		Mammal element = list.get(0);
		// add
		list.add(new Mammal());
		list.add(new Cow());
		list.add(new Lion());
	}

	// wild card type argument
	public static void m2(List<?> list) {
	}

	// wild card type argument extends
	public static void m3(List<? extends Mammal> list) {
	}

	// wild card type argument super
	public static void m4(List<? super Mammal> list) {
	}

}
