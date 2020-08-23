package c.exceptionalEvents;

public class Test {

	public static void main(String[] args) {

		Calculator c = new Calculator();

		// handling number 2 - try-catch
		try {
			System.out.println(c.divide(10, 0));

		} catch (Exception e) {
			// handler - plan b - code to run in case of exception
			System.out.println("LaLaLa");
			System.out.println(e);
			e.printStackTrace();
		}

		System.out.println("main goes on");

	}

}
