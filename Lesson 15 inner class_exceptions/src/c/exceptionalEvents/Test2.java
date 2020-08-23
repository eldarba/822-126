package c.exceptionalEvents;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number: ");
		String in1 = sc.nextLine();
		System.out.print("enter another number: ");
		String in2 = sc.nextLine();
		sc.close();

		try {
			int a = Integer.parseInt(in1);
			int b = Integer.parseInt(in2);
			System.out.println(a + " + " + b + " = " + (a + b));
		} catch (NumberFormatException e) {
			System.out.println("your input is invalid");
		} catch (Exception e) {
			System.out.println("something else happend");
		}

		System.out.println("more to do");

	}

}
