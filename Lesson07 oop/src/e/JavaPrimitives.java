package e;

/**
 * this demo shows all Java primitives
 * 
 * @author Eldar
 */
public class JavaPrimitives {

	public static void main(String[] args) {

		// NUMERALS
		// numerals integers or decimals
		System.out.println(5); // integer
		System.out.println(5.32); // decimal

		// integer numerals
		byte x1 = 5; // 8 bit
		short x2 = 5; // 16 bit
		int x3 = 5; // 32 bit - default
		long x4 = 5; // 64 bit

		// decimal numerals
		float f1 = 5.4F; // 32 bit
		double f2 = 5.3; // 64 bit - default

		System.out.println(3.333333333333333333333333333333);
		System.out.println(3.333333333333333333333333333333F);

		// sufix F, D, L - float, double and long (literals only)
		System.out.println(5);
		System.out.println(5D);
		System.out.println(5F);
		System.out.println(999999999);
		System.out.println(999999999999L);

		int x = 5;
		float y = 54.36F;
		long z = 1500;
		// define a sum variable and print it
		float sum = x + y + z;
		System.out.println(sum);

		System.out.println("================");
		// LOGICAL
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = 10 < 100;
		boolean b4 = 10 > 100;
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);

		// CHARACTER
		// char 16 bit unicode
		char c1 = 'A';
		char c2 = 'ú';
		char c3 = '.';
		char c4 = ' ';
		char c5 = '+';
		char c6 = '5';
		char c7 = '"';
		char c8 = '\n'; // new line

		System.out.println(c1);
		System.out.println(c1);
		//

	}

}
