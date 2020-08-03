package a.homework;

import java.util.Arrays;

/*
 * Create a class that creates an array[10] of numbers with 
 * 
 * random values between 0-100 and prints the total sum and the average
 * */

public class Tar1 {

	public static void main(String[] args) {

		int sum = 0; // define a variable for the numbers sum
		System.out.println(sum);

		int[] arr = new int[10]; // create an array
		System.out.println(Arrays.toString(arr)); // print

		// populate array with random numbers
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 101);
			sum += arr[i]; // add value of current element to sum
		}

		System.out.println(Arrays.toString(arr)); // print
		System.out.println("sum: " + sum);

		double avg = (double) sum / arr.length;
		System.out.println("average: " + avg);
	}

}
