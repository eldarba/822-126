package b.wrapperClasses;

import javax.swing.JOptionPane;

public class Demo1 {

	public static void main(String[] args) {

		/*
		 * Wraper classes are Object representation of primitives
		 */
		{// inboxing and outboxing

			Integer x = new Integer(5); // inboxing - put a primitive inside a wrapper
			System.out.println(x);
			int a = x.intValue(); // outboxing - Wrapper to primitive

			Integer y = 5; // auto-inbox
			int b = y; // auto outboxing
			System.out.println(b); // b is primitive - no methods, just value
			System.out.println(y.doubleValue()); // y is object - has methods
		}
		{ // minimum and maximum

			System.out.println("================");
			// Warper classes utility methods
			System.out.println(Integer.MAX_VALUE);
			System.out.println(Integer.MIN_VALUE);
			System.out.println(Byte.MAX_VALUE);
			System.out.println(Byte.MIN_VALUE);
			System.out.println("=============");

			long x = 100;
			if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE) {
				byte y = (byte) x;
				System.out.println(y);
			} else {
				System.out.println("casting " + x + " to byte will overflow");
			}

		}

		{// convert a String of numeral pattern to a number
			System.out.println("parsing strings to numbers");
			String str = "234";
			int val = Integer.parseInt(str);
			System.out.println(val);

			String str1 = JOptionPane.showInputDialog("enter a number");
			String str2 = JOptionPane.showInputDialog("enter a number");
			System.out.println(str1);
			System.out.println(str2);
			System.out.println(str1 + str2);

			int a = Integer.parseInt(str1); // parse
			int b = Integer.parseInt(str2); // parse
			System.out.println(a + " + " + b + " = " + (a + b));
		}

	}
}
