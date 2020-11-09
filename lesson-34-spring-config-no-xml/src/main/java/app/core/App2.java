package app.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import app.core.beans.vehicles.Vehicle;

public class App2 {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)) {

			Vehicle vehicle = ctx.getBean("car", Vehicle.class);

			vehicle.start();
			vehicle.stop();

			System.out.println(vehicle.getClass());
			System.out.println("=======================");
			Vehicle v1 = ctx.getBean("familyCar",  Vehicle.class);
			Vehicle v2 = ctx.getBean("sportsCar",  Vehicle.class);
			v1.start();
			v2.start();

		}

	}

}
