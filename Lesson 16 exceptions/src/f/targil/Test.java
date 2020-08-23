package f.targil;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Car car = new Car();
		System.out.println(car);

		System.out.println("color: " + car.getColor());
		System.out.println("speed: " + car.getSpeed());

		// ARM - Auto Resource Management - to close scanner automatically
		try (Scanner sc = new Scanner(System.in);) {
			System.out.println("enter car color " + Arrays.toString(Car.Color.values()));
			car.setColor(Car.Color.valueOf(sc.nextLine()));

			System.out.println("enter speed [max=" + Car.MAX_SPEED + ", min: " + Car.MIN_SPEED + "]");
			car.setSpeed(Integer.parseInt(sc.nextLine()));

		} catch (HighSpeedException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("Some other error");
			System.out.println(e);
		}

		System.out.println(car);
	}

}
