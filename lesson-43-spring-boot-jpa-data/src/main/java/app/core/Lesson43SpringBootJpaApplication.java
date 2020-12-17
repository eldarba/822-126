package app.core;

import java.time.LocalDate;
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
//			generateRandomStudents(studentRepo, 25);
		}

		{

			// display number of students of age 56
			// 1. write a derived method in the repository
			// 2. call the method in the test

			long x = studentRepo.countByAge(56);
			System.out.println("number of students aged 56: " + x);

			// get all students older than 75
//			List<Student> students = studentRepo.getAllStudentsOlderThan(75);
			List<Student> students = studentRepo.findByActiveTrue();
			System.out.println("=== active students");
			print(students);
			students = studentRepo.findByActiveFalse();
			System.out.println("=== inactive students");
			print(students);

			students = studentRepo.findByAgeBetween(10, 20);
			System.out.println("=== students aged 10 - 20");
			print(students);
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

	public static void generateRandomStudents(StudentRepository studentRepo, int amount) {

		String[] names = { "Dan", "Ron", "Dafna", "Yaniv", "Eldar", "Lior", "Maoz" };

		for (int i = 0; i < amount; i++) {
			Student student = new Student();
			student.setAge((int) (Math.random() * 121));
			String name = names[(int) (Math.random() * 100) % names.length];
			student.setName(name);
			student.setEmail(name + "@mail");
			student.setGender(Gender.values()[(int) (Math.random() * Gender.values().length)]);
			student.setActive(Math.random() < 0.8 ? true : false);

			int year = (int) (Math.random() * 20) + 2000;
			int month = (int) (Math.random() * 12) + 1;
			int dayOfMonth = (int) (Math.random() * 28) + 1;
			student.setEnrollDate(LocalDate.of(year, month, dayOfMonth));

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
