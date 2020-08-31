package c.implementations;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Demo1Lists {

	public static void main(String[] args) {

		List<Integer> list;

		// array based - good for random access
		list = new ArrayList<>();
		list.add(5);
		list.add(6);
		list.add(7);
		System.out.println(list);
		list.remove(0);
		System.out.println(list);

		System.out.println("================");
		// linked list based - good for data manipulation (add and remove)
		list = new LinkedList<>();
		list.add(5);
		list.add(6);
		list.add(7);
		System.out.println(list);
		list.remove(0);
		System.out.println(list);

	}

}
