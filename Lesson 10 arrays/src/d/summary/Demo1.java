package d.summary;

import java.util.Arrays;

public class Demo1 {

	public static void main(String[] args) {

		// dynamic init
		int[] arr = new int[5];
		arr[0] = 5;
		System.out.println(arr[0]);

		// static init
		int[] arr2 = { 3, 6, 9 };
		System.out.println(Arrays.toString(arr2));

		// matrix
		int[][] matrix = new int[5][9];

		// 2 Dimension
		int[][] dim2 = new int[5][];
		dim2[0] = new int[25];
		dim2[1] = new int[5];
		dim2[2] = new int[17];
		dim2[3] = new int[200];
		dim2[4] = new int[25];
	}

}
