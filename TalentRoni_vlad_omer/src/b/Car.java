package b;

public class Car extends Vehicle {

	// instance variable - dynamic reference
	private int number;

	public Car() {
		// first line of all ctors is invoking another ctor (in this class or super
		// class)
	}

	// class variable - static reference
	private static int counter;

	public int getNumber() {
		return this.number;
	}

	@Override
	public void drive() {
		System.out.println("car is driving");
	}

	public static int getCounter() {
		return counter;
	}

}
