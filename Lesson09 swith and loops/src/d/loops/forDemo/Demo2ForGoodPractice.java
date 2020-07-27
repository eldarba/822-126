package d.loops.forDemo;

public class Demo2ForGoodPractice {

	public static void main(String[] args) {

		int a = (int) (Math.random() * 26);
		int b = (int) (Math.random() * 26);
//		a = b;

		if (a > b) {
			int temp = a;
			a = b;
			b = temp;
		}

		System.out.println(a + ", " + b);

		for (int i = a; i < b; i++) {
			System.out.print(i + ", ");
		}
		System.out.println(b);
	}

}
