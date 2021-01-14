package app.core;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import app.core.entities.Employee;
import app.core.repositories.EmployeeRepository;

//@Configuration
public class PopulateDatabase {

	@Bean
	public CommandLineRunner initDb(EmployeeRepository repo) {

		// anonymous inner class
		CommandLineRunner runner = new CommandLineRunner() {

			@Override
			public void run(String... args) throws Exception {
				System.out.println(">>> CommandLineRunner.run");
				repo.save(new Employee("Ron", "Comodor"));
				repo.save(new Employee("Ben", "Sailor"));
			}
		};

		return runner;
	}

}
