package exercise04.operators;

public class Tar1 {

	public static void main(String[] args) {
		// Create a class that defines 2 random numbers (between 0-100)
		int a = (int) (Math.random() * 101);
		int b = (int) (Math.random() * 101);
		// and print with a clear message:

		// each number
		System.out.println("first number:\t" + a);
		System.out.println("second number:\t" + b);

		// the sum of the numbers
		System.out.println("sum is " + (a + b));
		// the average value
		System.out.println("average is " + (a + b) / 2D);

		// the remainder when dividing each in 10
		System.out.println("remainder of " + a + " divided by 10 is " + a % 10);
		System.out.println("remainder of " + b + " divided by 10 is " + b % 10);
		/*
		 * the area of a rectangle where one number is the width and the other is the
		 * height
		 */
		System.out.println("area of a " + a + " by " + b + " rectangle is " + a * b);
	}

}
