package g.ifDemo;

public class Demo3 {

	public static void main(String[] args) {

		int a = 0;
		int b = 10;
		int x = (int) (Math.random() * (b - a + 1)) + a;
		System.out.println(x);
		System.out.println("================");

		if (x > 5) {
			System.out.println("Big");
		} else {
			System.out.println("Small");
		}

	}

}
