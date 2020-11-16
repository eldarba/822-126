package app.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import app.core.beans.vehicles.Car;

public class App4 {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)) {

			Car c = ctx.getBean(Car.class);
			System.out.println(c);

		}

	}

}
