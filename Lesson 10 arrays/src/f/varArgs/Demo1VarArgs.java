package f.varArgs;

import java.util.Arrays;

public class Demo1VarArgs {

	public static void main(String... args) {

		System.out.println(sum(5, 3));
		System.out.println(sum(5, 3, 2));
		System.out.println(sum(5, 3, 2, 6, 6, 6));
		// a varargs method can get the arguments one by one
		System.out.println(sum(5, 3, 2, 3, 4, 8, 8, 8));
		System.out.println(sum());

		// a varargs method can get the arguments as an array
		int[] arr = { 2, 2, 2 };
		int x = sum(arr);
		System.out.println(x);

	}

	public static int sum(int a, int b) {
		return a + b;
	}

	public static int sum(int... nums) {
		// in the method nums is an array
		System.out.println(Arrays.toString(nums));
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		return sum;
	}

}
