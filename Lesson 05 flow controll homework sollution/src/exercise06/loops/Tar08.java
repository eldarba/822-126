package exercise06.loops;

import java.util.Random;

public class Tar08 {

	/*
	 * Fibonacci set is an array of numbers. Each number is the sum value of the two
	 * previous numbers. The first number is 1
	 * 
	 * [1,1,2,3,5,8,13,21,34,55,89…]
	 * 
	 * Create a class that defines a random number named “index” with a value
	 * between 0-50 and prints the number in Fibonacci set that is located in the
	 * “index” position
	 */

	public static void main(String[] args) {
		Random random = new Random();
		int index = random.nextInt(51); // 0 - 50

		double n1 = 1;
		double n2 = 1;

		for (int i = 2; i <= index; i++) {
			double temp = n2;
			n2 = n1 + n2;
			n1 = temp;
//			System.out.println(n2); // to see other elements
		}
		System.out.println("=================");
		System.out.println("Fibonaci at index " + index + " is:");
		System.out.println(n2);
	}

}
