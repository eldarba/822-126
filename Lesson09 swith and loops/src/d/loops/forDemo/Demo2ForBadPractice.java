package d.loops.forDemo;

public class Demo2ForBadPractice {

	public static void main(String[] args) {

		int a = (int) (Math.random() * 26);
		int b = (int) (Math.random() * 26);
		System.out.println(a + ", " + b);

		if (a < b) {
			for (int i = a; i <= b; i++) {
				System.out.println(i);
			}
		} else {
			for (int i = b; i <= a; i++) {
				System.out.println(i);
			}
		}
	}

}
