package b;

public class Test {

	public static void main(String[] args) {

		ParkingLotEnum pl1 = ParkingLotEnum.INSTANCE;
		ParkingLotEnum pl2 = ParkingLotEnum.INSTANCE;

		pl1.addCar(new Car());
		pl2.addCar(new Car());

		System.out.println(pl1 == pl2);

		System.out.println(pl1.getNumberOfCars());
		System.out.println(pl2.getNumberOfCars());

	}

}
