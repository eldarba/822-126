package c.loops.whileDemo;

import java.util.Scanner;

public class Demo2While2 {

	public static void main(String[] args) {

		// define a secret password
		int secretPassword = 1234;

		// prompt user for input
		System.out.print("enter password: ");

		// input user password
		Scanner sc = new Scanner(System.in);
		int userInput = sc.nextInt();
		int c = 1;

		while (userInput != secretPassword && c < 3) {
			// prompt user for input
			System.out.print("wrong password. enter again: ");
			userInput = sc.nextInt();
			c++;
		}

		if (userInput == secretPassword) {
			System.out.println("You are logged in [" + c + " attempts]");
		} else {
			System.out.println("login failed");
		}

		sc.close();

	}

}
