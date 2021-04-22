package p04.adapter;

public class Main {

	public static void main(String[] args) {

		Car car = new FamilyCar();
		System.out.println(car);
		CarDriver driver = new CarDriver(car);
		driver.driveCar(100, 50, "NORTH");
		System.out.println(car);

		System.out.println("=====================");
		Automobil auto = new Automobil();
		// driver cannt drive an automobil
//		CarDriver driver2 = new CarDriver(auto);

		AutomobilToCarAdapter autoToCarAdapter = new AutomobilToCarAdapter(auto);

		CarDriver autoDriver = new CarDriver(autoToCarAdapter);
		System.out.println(autoToCarAdapter);
		autoDriver.driveCar(200, 25, "WEST");
		System.out.println(autoToCarAdapter);
		System.out.println("=====================");
		autoDriver.driveCar(20, 3, "WESTAAA");
		System.out.println(autoToCarAdapter);

	}
}
