package b.generics;

import java.util.Collection;

public class DemoGenericMethod {

	static void fromArrayToCollection(Object[] a, Collection<?> c) {
		for (Object o : a) {
			// c.add(o); // compile-time error
		}
	}

}
