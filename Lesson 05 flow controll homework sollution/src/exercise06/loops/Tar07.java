package exercise06.loops;

import java.util.Random;

public class Tar07 {

	/*
	 * Create a class that defines a random number between 0-100 and prints the
	 * factorial value [4 ===> 1 X 2 X 3 X 4]
	 */

	public static void main(String[] args) {
		Random random = new Random();
		int n = random.nextInt(100); // 0 - 100
		double factorial = 1;

		for (int i = 2; i <= n; i++) {
			factorial *= i;
//			System.out.println(factorial); // to see the computations
		}

		System.out.println("=====================");
		System.out.println(n + "! = " + factorial);

	}

}
