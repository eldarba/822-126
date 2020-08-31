package b.generics;

import java.util.Collection;
import java.util.Iterator;

public class Demo2WildCard {

	// print the collection
	public static void printObjects(Collection<?> objects) {
		for (Object obj : objects) {
			System.out.println(obj);
		}
	}

	// get from the collection
	public static Object getObject(Collection<?> mammals) {
		Iterator<?> it = mammals.iterator();
		Object obj = it.next();
		return obj;
	}

	// add to the collection
	public static void addObjects(Collection<?> objects) {
//		Mammal mammal = new Mammal();
//		Cow cow = new Cow();
//		Lion lion = new Lion();
		objects.add(null);
	}

}
