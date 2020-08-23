package exercise06.loops;

import java.util.Random;

public class Tar02 {
	/*
	 * Create a class that defines two random values and prints all values between
	 * them. note - which variable holds the higher value is not known.
	 */
	public static void main(String[] args) {

		Random random = new Random();

		int a = random.nextInt(11);
		int b = random.nextInt(11);
//		b = a; // test for equality
		System.out.println(a + ", " + b);
		System.out.println("=========");

		int incrementor = a < b ? 1 : -1;

		for (int i = a; i != b; i += incrementor) {
			System.out.println(i);
		}
		System.out.println(b);

	}
}
