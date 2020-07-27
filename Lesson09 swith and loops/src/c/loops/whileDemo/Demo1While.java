package c.loops.whileDemo;

public class Demo1While {

	public static void main(String[] args) {

		int x = (int) (Math.random() * 101);
		System.out.println(x);

		// print all numbers from 0 to x
		int c = 0;

		while (c <= x) {
			System.out.print(c + " ");
			c++;
		}

		System.out.println();

	}

}
