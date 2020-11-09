package app.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import app.core.beans.Person;

@Configuration
@ComponentScan
public class AppConfig {
	
	// beans definition here [@Configuration]
		@Bean
		@Scope("prototype")
		public Person standardPerson() {
			Person p = new Person(111, "standard", 18);
			return p;
		}

}
