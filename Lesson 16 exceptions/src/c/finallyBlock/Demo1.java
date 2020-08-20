package c.finallyBlock;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("enter a number: ");
			int x = Integer.parseInt(sc.nextLine());
			System.out.println(x);
		} catch (NumberFormatException e) {
			System.out.println("you must enter a number");
			return; // even return will not stop the finally block
		} finally {
			// this block will run anyway
			System.out.println("scanner closed");
			sc.close();
		}

		System.out.println("Bye");

	}

}
