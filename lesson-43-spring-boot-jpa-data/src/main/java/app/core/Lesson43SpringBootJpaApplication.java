package app.core;

import java.util.Collection;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import app.core.entities.Student;
import app.core.entities.Student.Gender;
import app.core.repositories.StudentRepository;

@SpringBootApplication
public class Lesson43SpringBootJpaApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(Lesson43SpringBootJpaApplication.class, args);

		StudentRepository studentRepo = ctx.getBean(StudentRepository.class);

		{
			List<Student> students;
		}

		{
//			System.out.println(studentRepo.getAllFemaleStudents());
//			System.out.println(studentRepo.getAllFemaleStudents(Sort.by("id")));
//			System.out.println(studentRepo.getAllMaleStudents());
		}

		{
//			int id = 3;
//
//			// wrapper for an optional value. it can be either present or empty
//			Optional<Student> opt = studentRepo.findById(id);
//
////		System.out.println(opt.get()); // might throw an exception
//			System.out.println(opt); // might throw an exception
//
//			if (opt.isPresent()) {
//				Student std = opt.get();
//				System.out.println(std);
//			} else {
//				System.out.println("id " + id + " not found");
//			}
		}
	}

	public static void generateRandomStudents(StudentRepository studentRepo) {

		String[] names = { "Dan", "Ron", "Dafna", "Yaniv", "Eldar", "Lior", "Maoz" };

		for (int i = 0; i < 25; i++) {
			Student student = new Student();
			student.setAge((int) (Math.random() * 121));
			String name = names[(int) (Math.random() * 100) % names.length];
			student.setName(name);
			student.setEmail(name + "@mail");
			student.setGender(Gender.values()[(int) (Math.random() * 2)]);

			System.out.println(student);

			studentRepo.save(student);
		}
	}

	// method for printing list of elements
	public static void print(Collection<?> col) {
		System.out.println("=========================");
		for (Object e : col) {
			System.out.println(e);
		}
		System.out.println("=========================");
	}

}
