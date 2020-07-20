package b.types;

public class CarTest {
	public static void main(String[] args) {

		// create a car instance
		Car c = new Car();

		// create an engine instance
		Engine someEngine = new Engine();
		// set the engine state
		someEngine.on = false;
		someEngine.volume = 1800;

		// set the car state
		c.speed = 0;
		c.theEngine = someEngine;

		// print the car state
		System.out.println(c.speed);
		System.out.println(c.theEngine.volume);
		System.out.println(c.theEngine.on);

	}
}
