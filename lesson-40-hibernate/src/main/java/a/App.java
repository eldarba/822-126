package a;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import a.entities.Student;

public class App {

	public static void main(String[] args) {
		// Configuration object holds all configuration data from file and classes
		Configuration cfg = new Configuration().configure().addAnnotatedClass(Student.class);
		// SessionFactory - gives us session objects - connection
		try (SessionFactory factory = cfg.buildSessionFactory();) {
			System.out.println("hibernate runs");
			/*
			 * Session - represents a connection and a persistence context - where entities
			 * live
			 */
			Session session = factory.getCurrentSession();
			Student student = new Student("dan", "dan@email");
			// session operations are bound in a transaction - unit of work
			session.beginTransaction();
			session.save(student); // persist an object
			session.getTransaction().commit(); // flush operations to the database
		}
	}
}
