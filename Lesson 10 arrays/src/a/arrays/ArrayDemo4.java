package a.arrays;

public class ArrayDemo4 {

	public static void main(String[] args) {

		// create an array of 25 int elements (0 - 100) and print
		int[] arr = new int[25];

		// populate
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 101);
			System.out.println(arr[i]);
		}

	}

}
