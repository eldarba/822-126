package b.arraysStaticInit;

import java.util.Arrays;

public class Demo1 {

	public static void main(String[] args) {
		// static init
		int[] arr1 = { 2, 4, 6 };
		String[] days = { "sunday", "monday", "tuesday", "Wed", "Thu" };

		// static init
		char[] arr21 = { 'A', 'B', 'C', 'D' };

		// dynamic init
		char c1 = 'A';
		char c2 = 'Z';

		char[] a2z = new char[c2 - c1 + 1];
		System.out.println(a2z.length);

		for (int i = 0, c = c1; i < a2z.length; i++, c++) {
			a2z[i] = (char) c;
		}

		// print array the short way
		System.out.println(Arrays.toString(a2z));
	}

}
