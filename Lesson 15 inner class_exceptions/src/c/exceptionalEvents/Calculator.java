package c.exceptionalEvents;

public class Calculator {

	// handling number 1 - throw the exception to caller
	public int divide(int a, int b) throws Exception { // throws declaration
		if (b != 0) {
			return a / b; // all is good
		} else {
			// checked exception
			Exception e = new Exception("you caanot divide by 0");
			throw e; // exception
		}
	}

}
