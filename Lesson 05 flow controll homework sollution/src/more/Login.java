package more;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int password = 123;
		int input;

		do {
			System.out.println("enter password [123] numbers only");
			input = sc.nextInt();
		} while (input != password);

		System.out.println("you are logged in");
		System.out.println("Bye");

		sc.close();
	}

}
