package a;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import a.entities.Student;

public class App5HQL {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
		Session session = factory.getCurrentSession();

		try {
			session.getTransaction().begin();

			String hql = "from Student";
			Query<Student> query = session.createQuery(hql, Student.class);
			List<Student> list = query.getResultList();

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
