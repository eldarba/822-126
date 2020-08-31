package c.implementations;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Demo2Sets {

	public static void main(String[] args) {

		Set<String> set;

		// unordered (hash)
		set = new HashSet<String>();
		set.add("sunday");
		set.add("monday");
		set.add("tuesday");
		set.add("wednesday");
		System.out.println(set);
		System.out.println("===============");

		// ordered
		set = new LinkedHashSet<String>();
		set.add("sunday");
		set.add("monday");
		set.add("tuesday");
		set.add("wednesday");
		System.out.println(set);
		System.out.println("===============");

		// sorted
		set = new TreeSet<String>();
		set.add("sunday");
		set.add("monday");
		set.add("tuesday");
		set.add("wednesday");
		System.out.println(set);
		System.out.println("===============");
	}

}
