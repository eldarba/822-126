package b;

// utility class for cars
public class CarController {

	public static void driveCar(Car car) {
		car.drive();
	}

	public static void main(String[] args) {

		Car car = new Car();

		driveCar(car);
	}

}
