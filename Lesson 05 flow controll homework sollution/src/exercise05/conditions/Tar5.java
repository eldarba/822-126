package exercise05.conditions;

import java.util.Random;

public class Tar5 {

	/*
	 * Create a class that defines 3 random numbers (0 - 100) and prints the bigger
	 * value
	 */

	public static void main(String[] args) {

		Random random = new Random();

		int a = random.nextInt(101);
		int b = random.nextInt(101);
		int c = random.nextInt(101);

		System.out.println(a + ", " + b + ", " + c);

		int max;
		if (a > b && a > c) {
			max = a;
		} else if (b > c) {
			max = b;
		} else {
			max = c;
		}

		System.out.println("max: " + max);

	}

}
