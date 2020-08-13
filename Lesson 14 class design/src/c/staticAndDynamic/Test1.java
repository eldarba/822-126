package c.staticAndDynamic;

public class Test1 {

	public static void main(String[] args) {

		// Car.numberOfCarsMade = 9000;

		System.out.println("cars made: " + Car.getNumberOfCarsMade()); // static reference

		Car c = new Car();
		c.setSpeed(25);
		Car c2 = new Car();
		System.out.println("car speed: " + c.getSpeed()); // dynamic reference
		System.out.println("car number: " + c.number); // dynamic reference
//		c.number = 12;

		System.out.println("cars made: " + Car.getNumberOfCarsMade()); // static reference
	}

}
