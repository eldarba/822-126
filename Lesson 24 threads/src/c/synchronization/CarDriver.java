package c.synchronization;

public class CarDriver extends Thread {

	private Car car;
	private int distance;

	public CarDriver(String name, Car car, int distance) {
		super(name);
		this.car = car;
		this.distance = distance;
	}

	@Override
	public void run() {
		car.startCar();
		car.drive(distance);
	}

}
