package app.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import app.core.beans.Person;
import app.core.beans.vehicles.Car;
import app.core.beans.vehicles.CarEngine;
import app.core.beans.vehicles.TurboEngine;
import app.core.beans.vehicles.Vehicle;

@Configuration
@PropertySource("application.properties")
@ComponentScan
public class AppConfig {

	// beans definition here [@Configuration]
	@Bean
	@Scope("prototype")
	public Person standardPerson() {
		Person p = new Person(111, "standard", 18);
		return p;
	}

	@Bean
	@Scope("prototype")
	public Vehicle sportsCar() {
		Car c = new Car(new TurboEngine(), 0);
		return c;
	}

	@Bean
	@Scope("prototype")
	public Vehicle familyCar() {
		Car c = new Car();
		c.setEngine(new CarEngine());
		return c;
	}

}
