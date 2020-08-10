package c.finalDemo;

public class Demo1 {

	// final keyword is a modifier of variables, methods and classes
	// final makes set something so it cannot be changed
	
	// final variables cannot be reassigned
	// final methods cannot be overridden
	// final classes cannot be inherited (extended)

	public static void main(String[] args) {

		// final data
		final int x = 5;
		// x = 100; // cannot be changed after initialization

		final int y; // declaration only (blank final)
		y = 50; // initialization
//		y = 9; // cannot be changed after initialization
		
		System.out.println(y);
	}

}
