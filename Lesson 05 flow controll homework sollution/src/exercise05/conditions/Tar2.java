package exercise05.conditions;

import java.util.Random;

public class Tar2 {

	public static void main(String[] args) {
		/*
		 * Create a new class that defines a random number with a value between 0-100.
		 * 
		 * o if the number is greater than 50 – print “Big !”
		 * 
		 * o if the number is less then 50 – print “Small !”
		 * 
		 * o if the number equals to 50 – print “Bingo !”
		 */
		Random random = new Random();
		int r = random.nextInt(101);
//		r = 50; // use this line to test for Bingo
		System.out.println("the number is: " + r);

		if (r > 50) {
			System.out.println("Big !");
		} else if (r < 50) {
			System.out.println("Small !");
		} else {
			System.out.println("Bingo !");
		}

	}

}
