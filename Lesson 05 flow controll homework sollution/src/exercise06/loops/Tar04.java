package exercise06.loops;

import java.util.Random;

public class Tar04 {

	/*
	 * Create a class that defines two random values ‘max’ and ‘den’ and prints all
	 * the numbers from 0 to ‘max’ that can be divided with ‘den’
	 */

	public static void main(String[] args) {

		Random random = new Random();

		int max = random.nextInt(81) + 20; // 20 - 100
		int den = random.nextInt(11); // 0 - 10

		System.out.println("max: " + max);
		System.out.println("den: " + den);
		System.out.println("============================");

		if (den != 0) {
			for (int i = 0; i <= max; i++) {
				if (i % den == 0) {
					System.out.println(i + " >>>can divided by " + den);
				}
			}
		} else {
			System.out.println("den was 0");
		}
	}

}
