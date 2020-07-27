package e.loops.doWhileDemo;

import java.util.Scanner;

public class Demo2While2 {

	public static void main(String[] args) {

		// define a secret password
		int secretPassword = 1234;

		Scanner sc = new Scanner(System.in);
		int userInput;

		do {
			// prompt user for input
			System.out.print("enter password: ");
			userInput = sc.nextInt();
		} while (userInput != secretPassword);

		System.out.println("You are logged in");

		sc.close();

	}

}
