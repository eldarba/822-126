package b.generics;

import java.util.Collection;
import java.util.Iterator;

import b.generics.animals.Mammal;

public class Demo3BoundedWildCardExtends {

	// print the collection
	public static void printMammals(Collection<? extends Mammal> mammals) {
		for (Mammal mammal : mammals) {
			System.out.println(mammal);
		}
	}

	// get from the collection
	public static Mammal getMammals(Collection<? extends Mammal> mammals) {
		Iterator<? extends Mammal> it = mammals.iterator();
		Mammal mammal = it.next();
		return mammal;
	}

	// add to the collection
	public static void addMammals(Collection<? extends Mammal> mammals) {
//		Mammal mammal = new Mammal();
//		Cow cow = new Cow();
//		Lion lion = new Lion();
		mammals.add(null);
	}

}
