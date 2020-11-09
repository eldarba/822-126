package app.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import app.core.beans.vehicles.Vehicle;

public class App2 {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)) {

			// get the bean directly from the @Component
			Vehicle vehicle = ctx.getBean("car", Vehicle.class);
			vehicle.start();
			vehicle.stop();
			System.out.println(vehicle.getClass());
			
			
			System.out.println("=======================");
			// get the bean from the @Bean method
			System.out.println("creating a family car with car engine");
			Vehicle v1 = ctx.getBean("familyCar",  Vehicle.class);
			v1.start();
			
			System.out.println("creating a sports car with turbo engine");
			Vehicle v2 = ctx.getBean("sportsCar",  Vehicle.class);
			v2.start();

		}

	}

}
