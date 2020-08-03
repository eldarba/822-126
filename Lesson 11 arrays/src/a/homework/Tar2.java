package a.homework;

import java.util.Arrays;

public class Tar2 {
	/*
	 * Create an array[50] of numbers with random values between 0-100 and prints
	 * the highest value and its index in the array
	 */
	public static void main(String[] args) {

		// define variables for maximum and its index
		int max = 0;
		int index = 0;

		// create the array
		int[] arr = new int[10];

		// populate array with random numbers
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 101);

			// update maximum if current element is greater than max
			if (arr[i] > max) {
				max = arr[i]; // this is the new max
				index = i; // this is the new max index
			}
		}
		System.out.println(); // after all elements printed add new line

		System.out.println(Arrays.toString(arr));
		System.out.println("max: " + max);
		System.out.println("max index: " + index);

	}

}
