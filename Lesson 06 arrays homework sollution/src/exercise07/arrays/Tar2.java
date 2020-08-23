package exercise07.arrays;

import java.util.Arrays;
import java.util.Random;

public class Tar2 {

	/*
	 * Create a class that creates an array[50] of numbers with random values
	 * between 0-100 and prints the highest value and its index in the array
	 */

	public static void main(String[] args) {

		int[] arr = new int[50];
		int max = 0;
		int maxIndex = -1;
		Random random = new Random();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(101);
			if (arr[i] > max) {
				max = arr[i];
				maxIndex = i;
			}
		}

		System.out.println(Arrays.toString(arr));
		System.out.println("max: " + max);
		System.out.println("index: " + maxIndex);
	}

}
