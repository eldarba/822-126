package core.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import core.app.classes.Person;
import core.app.classes.cars.Car;

public class SpringApplication {

	public static void main(String[] args) {

		// the application context is the spring container
		try (ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");) {
			// ask the context to give us a bean
			Person p1 = ctx.getBean("thePerson", Person.class);
			Person p2 = (Person) ctx.getBean("thePerson");
			Person p3 = ctx.getBean(Person.class);
			
			System.out.println("===============");
			System.out.println(p1.hashCode());
			System.out.println(p2.hashCode());
			System.out.println(p3.hashCode());
			System.out.println("===============");
			
			System.out.println(p1);
			System.out.println(p2);
			System.out.println(p3);
			
			Car c1 = ctx.getBean("car1", Car.class);
			System.out.println(c1.startDriving());
			System.out.println(c1.startHonk());
		}

	}

}
