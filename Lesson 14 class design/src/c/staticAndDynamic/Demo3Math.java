package c.staticAndDynamic;

import static java.lang.Math.PI;

public class Demo3Math {

	public static void main(String[] args) {

		System.out.println(PI); // shorter because of static import
		System.out.println(Math.E);

		System.out.println("max speed for cars: " + Car.MAX_SPEED);

	}

}
