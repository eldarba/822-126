package c.synchronization;

public class Test {

	public static void main(String[] args) {

		Car car1 = new Car(111);
//		Car car2 = new Car(222);

		CarDriver roni = new CarDriver("Roni", car1, 400);
		CarDriver danna = new CarDriver("Danna", car1, 30);

		roni.start();
		danna.start();

	}

}
