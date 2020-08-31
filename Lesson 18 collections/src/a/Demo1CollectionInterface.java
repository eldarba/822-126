package a;

import java.util.Collection;

public class Demo1CollectionInterface {

	public static void main(String[] args) {

		String[] arr1;
		int[] arr2;
		double[] arr3;

		// collection of String
		// <Type> - type parameter - make the collection type safe
		Collection<String> col = null;
		// add elements
		col.add("aaa");
		col.add("bbb");
		col.add("ccc");
		// get the size (number of elements)
		col.size();
	}

}
