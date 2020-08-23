package exercise06.loops;

import java.util.Random;

public class Tar03 {

	/*
	 * Create a class that defines a random number and prints all even numbers from
	 * 0 to that number
	 */

	public static void main(String[] args) {

		Random random = new Random();

		int r = random.nextInt(21);
		System.out.println(r);
		System.out.println("=========");

		for (int i = 0; i <= r; i += 2) {
			System.out.println(i);
		}

	}

}
