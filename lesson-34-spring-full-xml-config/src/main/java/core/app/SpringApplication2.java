package core.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import core.app.classes.Person;
import core.app.classes.cars.Car;

public class SpringApplication2 {

	public static void main(String[] args) {

		// the application context is the spring container
		try (ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");) {
			Person p1 = ctx.getBean("standardPerson", Person.class);
			Person p2 = ctx.getBean("specialPerson", Person.class);
			
			System.out.println(p1);
			System.out.println(p2);
		}

	}

}
