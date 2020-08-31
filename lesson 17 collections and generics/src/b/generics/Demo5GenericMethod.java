package b.generics;

import java.util.Collection;

public class Demo5GenericMethod {

//	static void fromArrayToCollection(Object[] a, Collection<?> c) {
//	    for (Object o : a) { 
//	        // c.add(o); // compile-time error
//	    }
//	}

	static <T> void fromArrayToCollection(T[] a, Collection<? super T> c) {
		for (T o : a) {
			c.add(o); // compile-time error
		}
	}

}
