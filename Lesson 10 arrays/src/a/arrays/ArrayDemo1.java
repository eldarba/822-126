package a.arrays;

public class ArrayDemo1 {

	public static void main(String[] args) {

		// create an array of 5 int elements
		int[] arr = new int[5];
		// assign the value 7 to element at index 2
		arr[2] = 7;

		// access array elements
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println("=============");
		System.out.println("array length: " + arr.length);
		System.out.println("array length: " + args.length);

	}

}
