package app.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import app.core.beans.vehicles.Vehicle;

public class App2 {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)) {
			
			Vehicle vehicle = ctx.getBean(Vehicle.class);
			
			vehicle.start();
			vehicle.stop();
			
			System.out.println(vehicle.getClass());

		}

	}

}
