package a;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import a.entities.Student;

public class App6HQL {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
		Session session = factory.getCurrentSession();

		try {
			session.getTransaction().begin();

			List<Student> list = session.createQuery("from Student", Student.class).getResultList();
			System.out.println(list);

			list = session.createQuery("from Student s where s.id=3 AND s.name=''", Student.class).getResultList();
			System.out.println(list);

			list = session.createQuery("from Student s where s.name='ran' OR s.name='dan'", Student.class)
					.getResultList();
			System.out.println(list);

			list = session.createQuery("from Student s where s.email LIKE '%mail' ", Student.class).getResultList();
			System.out.println(list);

			session.getTransaction().commit();

		} catch (Exception e) {
			session.getTransaction().rollback();
		} finally {
			session.close();
			factory.close();
		}
	}
}
