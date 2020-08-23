package more;

import java.util.Scanner;

public class Login3Trials {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int password = 123;
		int input;
		int maxTrials = 3;
		int trials = 0;
		boolean success = true;

		do {
			trials++;
			if (trials > maxTrials) {
				success = false;
				break;
			}
			System.out.println("enter password [123] numbers only");
			input = sc.nextInt();
		} while (input != password);

		if (success) {
			System.out.println("you are logged in");
		} else {
			System.out.println("Sorry you passed the maximum trials allowed " + maxTrials);
		}
		System.out.println("Bye");

		sc.close();
	}

}
