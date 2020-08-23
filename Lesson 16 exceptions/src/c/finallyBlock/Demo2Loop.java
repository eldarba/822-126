package c.finallyBlock;

import java.util.Scanner;

public class Demo2Loop {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			try {
				System.out.print("enter a number: ");
				int x = Integer.parseInt(sc.nextLine());
				System.out.println(x);
				break;
			} catch (NumberFormatException e) {
				System.out.println("you must enter a number");
			}
		}

		sc.close();
		System.out.println("Bye");

	}

}
