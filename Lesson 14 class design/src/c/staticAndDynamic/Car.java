package c.staticAndDynamic;

// ==== CLASS DEFINITION
public class Car {

// class members are fields, ctors and methods

// ==== FIELDS
	// instance variable - dynamic - belong to an object
	public final int number; // final
	private int speed;

	// class variable - static - belong to the class
	private static int numberOfCarsMade;
	// constant
	public static final int MAX_SPEED = 160;

// CTOR
	public Car() {
		numberOfCarsMade++;
		this.number = numberOfCarsMade;
	}

// METHODS
	// class method - static - belong to the class
	public static int getNumberOfCarsMade() {
		return numberOfCarsMade;
	}

	// instance method - dynamic - belong to an instance
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed <= MAX_SPEED) {
			this.speed = speed;
		}
	}

}
