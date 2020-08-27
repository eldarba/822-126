package a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo2List {

	public static void main(String[] args) {

		// create a list of type ArrayList
		List<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("English");
		list.add("Java");
		list.add("Math");

		System.out.println(list);
		System.out.println("size: " + list.size());
		System.out.println("contains C++? " + list.contains("C++"));
		System.out.println("contains Java? " + list.contains("Java"));
		System.out.println("index of English: " + list.indexOf("English"));
		System.out.println("index of Java: " + list.indexOf("Java"));
		System.out.println("index of History: " + list.indexOf("History"));
		System.out.println("index of Art: " + list.indexOf("Art"));

		// convert a list to an array of Object
		Object[] arrObj = list.toArray();
		// convert a list to an array of String
		String[] arrStr = list.toArray(new String[0]);

		System.out.println(Arrays.toString(arrObj));
		System.out.println(Arrays.toString(arrStr));
	}

}
