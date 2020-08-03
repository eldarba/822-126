package a.homework;

import java.util.Arrays;

public class Tar3 {
	/*
	 * Create a class that reverse a given array order. For example,
	 * 
	 * for the input {6,8,4,2,7,5} the result should be {5,7,2,4,8,6}
	 * 
	 * create an array[10] of numbers with random values between 0-10
	 * 
	 * to be used as an input
	 * 
	 * print the array before and after reversing
	 */
	public static void main(String[] args) {

		int[] arr = new int[10]; // create an array
		// populate
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 11);
		}
		// print
		System.out.println(Arrays.toString(arr));
		// reverse order
		for (int i = 0, j = arr.length - 1; i < arr.length / 2; i++, j--) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		// print
		System.out.println(Arrays.toString(arr));
	}

}
