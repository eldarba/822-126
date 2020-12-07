package a;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import a.entities.Student;

public class App4delete {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
		Session session = factory.getCurrentSession();

		try {
			session.getTransaction().begin();
			Student student = session.get(Student.class, 1);
			System.out.println(student);

			session.delete(student);

			session.getTransaction().commit();
			System.out.println(student + " delete from databse");

		} catch (Exception e) {
			session.getTransaction().rollback();
		} finally {
			session.close();
			factory.close();
		}
	}
}
