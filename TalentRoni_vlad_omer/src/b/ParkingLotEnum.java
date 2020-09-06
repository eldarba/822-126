package b;

import java.util.ArrayList;
import java.util.List;

public enum ParkingLotEnum {

	INSTANCE;

	private List<Car> cars = new ArrayList<>();

	public void addCar(Car car) {
		cars.add(car);
		System.out.println(car + " added");
	}

	public int getNumberOfCars() {
		return cars.size();
	}

}
