package core.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import core.app.classes.Car;

public class SpringApplication3 {

	public static void main(String[] args) {

		// the application context is the spring container
		try (ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");) {
			Car c1 = ctx.getBean("car1", Car.class);
			Car c2 = ctx.getBean("car2", Car.class);
			
			System.out.println(c1);
			System.out.println(c2);
		}

	}

}
