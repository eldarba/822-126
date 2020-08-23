package e.enums;

public class Car {

	private int number;
	private int speed;
	private CarColor color;

	public Car(int number, int speed, CarColor color) {
		super();
		this.number = number;
		this.speed = speed;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car [number=" + number + ", speed=" + speed + ", color=" + color + "]";
	}

	public static void main(String[] args) {

		Car c1 = new Car(101, 0, CarColor.RED);
		Car c2 = new Car(102, 0, CarColor.BLACK);
		System.out.println(c1);
		System.out.println(c2);
	}

}
