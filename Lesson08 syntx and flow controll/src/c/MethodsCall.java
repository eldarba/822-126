package c;

public class MethodsCall {

	public static void main(String[] args) {
		
		int a = 4;
		int b = 9;
		
		int sum = addNumbers(a, b);
		
		System.out.println(sum);

	}

	public static int addNumbers(int a, int b) {
		int sum = a + b;
		a = 0;
		return sum;
	}

}
