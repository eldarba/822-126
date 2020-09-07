package b;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

	private List<Car> cars = new ArrayList<>();

//===============================================
	// 1. the singleton object
	private static ParkingLot instance;

	// 2. private CTOR
	private ParkingLot() {
	}

	// 3. getter for the singleton
	public static ParkingLot getInstance() {
		if (instance == null) {
			instance = new ParkingLot();
		}
		return instance;
	}
//===============================================

	public void addCar(Car car) {
		cars.add(car);
		System.out.println(car + " added");
	}

	public int getNumberOfCars() {
		return cars.size();
	}

}
