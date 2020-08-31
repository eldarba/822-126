package b.generics;

import java.util.Collection;
import java.util.Iterator;

import b.generics.animals.Cow;
import b.generics.animals.Lion;
import b.generics.animals.Mammal;

public class Demo4BoundedWildCardSuper {

	// print the collection
	public static void printObjects(Collection<? super Mammal> objects) {
		for (Object obj : objects) {
			System.out.println(obj);
		}
	}

	// get from the collection
	public static Object getMammals(Collection<? super Mammal> mammals) {
		Iterator<? super Mammal> it = mammals.iterator();
		Object obj = it.next();
		return obj;
	}

	// add to the collection
	public static void addMammals(Collection<? super Mammal> mammals) {
		Mammal mammal = new Mammal();
		Cow cow = new Cow();
		Lion lion = new Lion();
		mammals.add(mammal);
		mammals.add(cow);
		mammals.add(lion);
	}

}
