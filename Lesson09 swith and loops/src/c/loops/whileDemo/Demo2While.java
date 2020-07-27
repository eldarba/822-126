package c.loops.whileDemo;

import java.util.Scanner;

public class Demo2While {

	public static void main(String[] args) {

		// define a secret password
		int secretPassword = 1234;

		// prompt user for input
		System.out.print("enter password: ");

		// input user password
		Scanner sc = new Scanner(System.in);
		int userInput = sc.nextInt();

		while (userInput != secretPassword) {
			// prompt user for input
			System.out.print("wrong password. enter again: ");
			userInput = sc.nextInt();
		}

		System.out.println("You are logged in");
		sc.close();

	}

}
