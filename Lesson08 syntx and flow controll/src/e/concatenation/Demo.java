package e.concatenation;

public class Demo {

	public static void main(String[] args) {
		{

			String s1 = "aaa";
			String s2 = "bbb";
			int x = 10;
			System.out.println(s1 + s2 + x);

			System.out.println("==========");
			System.out.println("aaa\nbbb");

			System.out.println("==========");
			System.out.println(s1 + s2 + "\n" + x);

		}

		{
			System.out.println("==========");
			int x = 4;
			int y = 3;
			System.out.println(x + " + " + y + " = " + (x + y));
			
			String expression = x + " + " + y + " = " + (x + y);
			System.out.println(expression);
		}

	}

}
