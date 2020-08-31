package d.varArgs;

public class Demo1 {

	// var args...
	public static int sum(int... nums) {
		int sum = 0;
		for (int x : nums) {
			sum += x;
		}
		return sum;
	}

	public static int sum(int a, int b) {
		int sum = a + b;
		return sum;
	}

	public static void main(String[] args) {
		int sum = sum(12, 6, 5, 43);
		System.out.println(sum);

		// הפסקה עד שמונה וחצי

	}

}
