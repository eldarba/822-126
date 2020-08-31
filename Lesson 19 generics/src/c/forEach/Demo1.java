package c.forEach;

import java.util.HashSet;
import java.util.Set;

public class Demo1 {

	public static void main(String[] args) {

		{

			int[] arr = { 33, 21, 17, 6, 98 };

			int sum = 0;
			for (int x : arr) {
				System.out.println(x);
				sum += x;
			}

			System.out.println("sum: " + sum);
		}

		System.out.println("============");
		{
			String[] arr = { "aaaa", "bbb", "cccccc" };
			for (String x : arr) {
				System.out.println("length: " + x.length());
			}
		}

		{
			System.out.println("=============");
			Set<Integer> set = new HashSet<>();
//			Set<Integer> set = new LinkedHashSet<Integer>(); // ordered
//			Set<Integer> set = new TreeSet<>(); // sorted
			set.add(12);
			set.add(7);
			set.add(32);
			set.add(25);

			int sum = 0;
			for (Integer x : set) {
				System.out.println(x);
				sum += x;
			}
			System.out.println("sum: " + sum);

		}

	}

}
