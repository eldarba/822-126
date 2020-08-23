package exercise06.loops;

import java.util.Random;

public class Tar09 {

	/*
	 * Create a class that defines a random value between 0-50 and prints Fibonacci
	 * set from 1 to that value
	 */

	public static void main(String[] args) {
		Random random = new Random();
		int limit = random.nextInt(51); // 0 - 50
		System.out.println("limit value is: " + limit);
		System.out.println("=================");

		int n1 = 1;
		int n2 = 1;

		while (n1 <= limit) {
			System.out.print(n1 + ", ");
			int temp = n2;
			n2 = n1 + n2;
			n1 = temp;
		}
		System.out.println();
	}

}
