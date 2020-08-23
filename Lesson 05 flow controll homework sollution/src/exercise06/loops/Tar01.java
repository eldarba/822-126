package exercise06.loops;

import java.util.Random;

public class Tar01 {
	/*
	 * Create a class that defines a random number and prints all numbers from 1 to
	 * that number
	 */
	public static void main(String[] args) {

		Random random = new Random();

		int r = random.nextInt(11);
		System.out.println(r);
		System.out.println("=========");

		for (int i = 1; i <= r; i++) {
			System.out.println(i);
		}

	}
}
