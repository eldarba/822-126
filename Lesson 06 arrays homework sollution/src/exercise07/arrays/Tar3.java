package exercise07.arrays;

import java.util.Arrays;
import java.util.Random;

/*
 * Create a class that eliminates duplications. The class should be
capable of getting an array with duplicated values and return an
array of unique values generated from it. For example, for the
input {1,2,5,1,6,1,5,4,8} the result should be {1,2,5,6,4,8}

create an array[10] of numbers with random values
between 0-10

create an array with the required size to host the unique values

fill the unique array

print both arrays
 * */
public class Tar3 {

	public static void main(String[] args) {

		// create 2 arrays
		int[] arr1 = new int[10];
		int[] arr2 = new int[11];

		Random random = new Random();
		// populate 1st array with random numbers
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = random.nextInt(11);
		}

		// populate 2nd array with -1
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = -1;
		}

		// print the arrays
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println("==================");

		// populate 2nd array with elements from 1st array
		for (int i = 0; i < arr1.length; i++) {
			arr2[arr1[i]] = arr1[i];
		}

		// print
		System.out.println(Arrays.toString(arr2));
		System.out.println("==================");

		// find length for the unique array
		int length = 0;

		for (int i = 0; i < arr2.length; i++) {
			if (arr2[i] != -1) {
				length++;
			}
		}

		// print
		System.out.println("length of the unique array: " + length);
		System.out.println("==================");

		// create the unique array
		int[] arrUnique = new int[length];

		// populate the unique array
		for (int i = 0, index = 0; i < arr2.length; i++) {
			if (arr2[i] != -1) {
				arrUnique[index++] = arr2[i];
			}
		}

		// print the unique array
		System.out.println("the unique array");
		System.out.println(Arrays.toString(arrUnique));
		System.out.println("==================");

	}

}
