package a.arrays;

public class ArrayDemo3 {

	public static void main(String[] args) {

		// create an array of 100 int elements
		int[] arr = new int[100];
		// all of value 150;
//		arr[0] = 150;
//		arr[1] = 150;
//		arr[2] = 150;

		// populate
		for (int i = 0; i < 100; i++) {
			arr[i] = 150;
		}

		// print all elements
		for (int i = 0; i < 100; i++) {
			System.out.println(arr[i] + " - " + i);
		}

	}

}
