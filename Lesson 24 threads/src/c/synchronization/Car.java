package c.synchronization;

public class Car {

	private int id;
	private int km;

	public Car(int id) {
		super();
		this.id = id;
	}

	// critical section (1 thread at a time)
	// the thread needs to acquire the one key of this Car instance
	public synchronized void drive(int distance) {
		// name of driver is name of current thread
		String driverName = Thread.currentThread().getName();
		System.out.println("driver " + driverName + " took car " + id + " [km=" + km + "] for " + distance + " km");
		this.km += distance;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("driver " + driverName + " with car " + id + " ended at " + km + " km");
	}

	public void startCar() {
		String driverName = Thread.currentThread().getName();
		try {
			Thread.sleep(2000);
			System.out.println("\t" + driverName + " going to start");
			Thread.sleep(2000);
			System.out.println("\t" + driverName + " preparing");
			Thread.sleep(2000);

			synchronized (this) {
				System.out.println("\t" + driverName + " critical step 1");
				Thread.sleep(2000);
				System.out.println("\t" + driverName + " critical step 2");
				Thread.sleep(2000);
				System.out.println("\t" + driverName + " critical step 3");
				Thread.sleep(2000);
			}

			System.out.println("\t" + driverName + " car started");
			System.out.println("\t" + driverName + " all is good");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
