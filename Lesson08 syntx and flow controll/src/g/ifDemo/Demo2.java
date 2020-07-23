package g.ifDemo;

public class Demo2 {

	public static void main(String[] args) {

		int r1 = (int) (Math.random() * 11);
		System.out.println(r1);

		int r2 = (int) (Math.random() * 101);
		System.out.println(r2);

		// 20 - 50
		// 0 - 30 >>> add 20
		int r3 = (int) (Math.random() * 31) + 20;
		System.out.println(r3);

		// formula
		int a = 100;
		int b = 200;
		int range = (int) (Math.random() * (b - a + 1)) + a;
		System.out.println(a + " to " + b + ": " + range);

	}

}
