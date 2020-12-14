package app.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import app.core.dao.StudentDao;
import app.core.entities.Student;
import app.core.entities.Student.Gender;

@SpringBootApplication
public class Lesson42SpringBootJpaApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(Lesson42SpringBootJpaApplication.class, args);

		StudentDao studentDao = ctx.getBean(StudentDao.class);

		Student s1 = new Student("Roni", "roni@mail", Gender.M);
		Student s2 = new Student("Dafna", "dafna@mail", Gender.F);
		studentDao.save(s1);
		studentDao.save(s2);
	}

}
