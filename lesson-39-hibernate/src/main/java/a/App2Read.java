package a;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import a.entities.Student;

public class App2Read {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
		Session session = factory.getCurrentSession();

		try {
			session.getTransaction().begin();
			Student student = session.get(Student.class, 100);
			System.out.println(student);
		} catch (Exception e) {
			session.getTransaction().rollback(); // cancel entire transaction
		} finally {
			session.close();
			factory.close();
		}
	}
}
