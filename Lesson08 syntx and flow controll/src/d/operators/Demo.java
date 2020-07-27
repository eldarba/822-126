package d.operators;

public class Demo {

	public static void main(String[] args) {
		{

			int x = 5;
			System.out.println(x++); // 5 - print and than increment
			System.out.println(x); // 6
			System.out.println(++x); // 7 - increment and than print

			// assignment returns a value - the result
			x = 350; // return 350
			int a, b, c, d, e;
			a = b = c = d = e = 5; // all variables are now 5

			System.out.println(x = 10); // assign x as 10 and print x
			System.out.println(x);
			System.out.println(-x);
			System.out.println(true);
			System.out.println(!true); // not reverses a boolean value

			System.out.println(true && true);
			System.out.println(true && false);
			System.out.println(true || false);
		}

		System.out.println("==========");

		{
			int a = 5;
			int b = 24;
			int max = a > b ? a : b;

//			if (a > b) {
//				max = a;
//			} else {
//				max = b;
//			}

			System.out.println(max);
		}

	}

}
