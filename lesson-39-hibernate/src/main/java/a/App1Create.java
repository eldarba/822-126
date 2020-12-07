package a;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import a.entities.Student;

public class App1Create {

	public static void main(String[] args) {
		// Configuration object holds all configuration data from file and classes
		Configuration cfg = new Configuration().configure().addAnnotatedClass(Student.class);
		// SessionFactory - gives us session objects - connection
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.getCurrentSession();
		try {
			System.out.println("hibernate runs");
			Student student = new Student("dan", "dan@email");
			// session operations are bound in a transaction - unit of work
			System.out.println(session.getTransaction().isActive());
			session.beginTransaction();
			System.out.println(session.getTransaction().isActive());
			session.save(student); // persist an object
			session.getTransaction().commit(); // flush operations to the database
		} catch (Exception e) {
			session.getTransaction().rollback(); // cancel entire transaction
		} finally {
			session.close();
			factory.close();
		}
	}
}
