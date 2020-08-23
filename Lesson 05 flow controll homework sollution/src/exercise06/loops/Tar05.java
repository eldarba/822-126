package exercise06.loops;

import java.util.Random;

public class Tar05 {

	/*
	 * Create a class that defines a random number with value between 0-10,000 and
	 * print the following details with clear messages:
	 * 
	 * number of digits [4867 ==> 4]
	 * 
	 * the first left digit [ 6843 ==> 6]
	 * 
	 * sum of the number’s digits [ 473 ==> 14]
	 * 
	 * opposite order of the number’s digits [5892 ==> 2985]
	 */

	public static void main(String[] args) {

		Random random = new Random();
		int n = random.nextInt(10_001); // 0 - 10,000
//		n = 0; // for testing
		System.out.println("the number: " + n);
		int numberOfDigits = 0;
		int firstLeftDigit = 0;
		int sumOfDigits = 0;
		int opposite = 0;

		while (n != 0) {
			numberOfDigits++;
			sumOfDigits += n % 10;
			if (n < 10) {
				firstLeftDigit = n;
			}
			opposite *= 10;
			opposite += n % 10;

			// get rid of the right digit
			n /= 10;
		}

		if (numberOfDigits == 0) {
			numberOfDigits = 1;
		}

		// print
		System.out.println("number of digits: " + numberOfDigits);
		System.out.println("first left digit: " + firstLeftDigit);
		System.out.println("sum of digits: " + sumOfDigits);
		System.out.println("opposite: " + opposite);
	}

}
