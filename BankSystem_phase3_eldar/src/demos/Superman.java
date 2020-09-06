package demos;

public class Superman {

	// 1. create a static instance inside the class (the singleton)
	private static Superman instance = new Superman();

	// 2. define a private CTOR
	private Superman() {
	}

	// 3. getter for the instance
	public static Superman getInstance() {
		return instance;
	}

}
