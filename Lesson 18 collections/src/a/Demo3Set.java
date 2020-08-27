package a;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Demo3Set {

	public static void main(String[] args) {

		// create a list of type ArrayList
		Set<String> set = new HashSet<String>();
		set.add("Math");
		set.add("Math");
		set.add("Java");
		set.add("English");
		set.add("Math");
		set.add("Java");

		System.out.println(set);
		System.out.println("size: " + set.size());
		System.out.println("contains C++? " + set.contains("C++"));
		System.out.println("contains Java? " + set.contains("Java"));
//		System.out.println("index of English: " + list.indexOf("English"));
//		System.out.println("index of Java: " + list.indexOf("Java"));
//		System.out.println("index of History: " + list.indexOf("History"));
//		System.out.println("index of Art: " + list.indexOf("Art"));

		// convert a list to an array of Object
		Object[] arrObj = set.toArray();
		// convert a list to an array of String
		String[] arrStr = set.toArray(new String[0]);

		System.out.println(Arrays.toString(arrObj));
		System.out.println(Arrays.toString(arrStr));
	}

}
