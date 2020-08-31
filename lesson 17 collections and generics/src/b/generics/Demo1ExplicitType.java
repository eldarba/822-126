package b.generics;

import java.util.Collection;
import java.util.Iterator;

import b.generics.animals.Cow;
import b.generics.animals.Lion;
import b.generics.animals.Mammal;

public class Demo1ExplicitType {

	// print the collection
	public static void printMammals(Collection<Mammal> mammals) {
		for (Mammal mammal : mammals) {
			System.out.println(mammal);
		}
	}

	// get from the collection
	public static Mammal getMammals(Collection<Mammal> mammals) {
		Iterator<Mammal> it = mammals.iterator();
		Mammal mammal = it.next();
		return mammal;
	}

	// add to the collection
	public static void addMammals(Collection<Mammal> mammals) {
		Mammal mammal = new Mammal();
		Cow cow = new Cow();
		Lion lion = new Lion();
		mammals.add(mammal);
		mammals.add(cow);
		mammals.add(lion);
	}

}
