package exercise07.arrays;

import java.util.Arrays;
import java.util.Random;

public class Tar1 {

	/*
	 * Create a class that creates an array[10] of numbers with random values
	 * between 0-100 and prints the total sum and the average
	 */

	public static void main(String[] args) {

		int[] arr = new int[10];
		int sum = 0;
		Random random = new Random();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(101);
			sum += arr[i];
		}

		System.out.println(Arrays.toString(arr));
		System.out.println("sum: " + sum);
		System.out.println("averages: " + (double) sum / arr.length);
	}

}
