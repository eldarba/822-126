package exercise05.conditions;

import java.util.Random;

public class Tar3 {

	public static void main(String[] args) {
		/*
		 * Create a class that defines a random number between 0-100.
		 * 
		 * o if the value is between 0-50 – print “Small !”
		 * 
		 * o else – print “Big !”
		 * 
		 * in addition :
		 * 
		 * o if the value is even (can be divided by 2) – print “Even”
		 * 
		 * o else – print “Odd”
		 */
		Random random = new Random();
		int r = random.nextInt(101);
		System.out.println("the number is: " + r);

		if (r <= 50) {
			System.out.println("Small !");
		} else {
			System.out.println("Big !");
		}
		if (r % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}

	}

}
