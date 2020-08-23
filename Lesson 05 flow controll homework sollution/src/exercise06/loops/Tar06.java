package exercise06.loops;

import java.util.Random;

public class Tar06 {

	/*
	 * Create a class that defines a random value between 0-100,000 and prints if it
	 * is a palindrome (a symmetric number like: 12321, 666, 47974, 404 …)
	 */

	public static void main(String[] args) {
		Random random = new Random();
		int n = random.nextInt(100_001); // 0 - 100,000
//		n = 12321; // for testing
		int copyN = n;
		int opposite = 0;

		while (n != 0) {
			opposite *= 10;
			opposite += n % 10;

			// get rid of the right digit
			n /= 10;
		}

		n = copyN;
		if (n == opposite) {
			System.out.println(n + " is palindrome");
		} else {
			System.out.println(n + " is NOT palindrome");
		}

	}

}
