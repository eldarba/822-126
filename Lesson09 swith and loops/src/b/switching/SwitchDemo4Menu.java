package b.switching;

import java.util.Scanner;

public class SwitchDemo4Menu {

	public static void main(String[] args) {
		System.out.println("=== MENU =============");
		System.out.println("1 ....... say hi");
		System.out.println("2 ....... say yes");
		System.out.println("3 ....... say no");
		System.out.println("======================");
		System.out.print("Your choice: ");

		Scanner sc = new Scanner(System.in); // create scanner for input
		int input = sc.nextInt(); // input from keyboard
		sc.close(); // close scanner
//		System.out.println(input); // print the user input

		switch (input) {
		case 1:
			System.out.println("Hi");
			break;
		case 2:
			System.out.println("Yes");
			break;
		case 3:
			System.out.println("No");
			break;
		default:
			System.out.println(input + " is not valid a option");
		}

	}

}
