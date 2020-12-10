package a;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import a.entities.Company;
import a.entities.CompanyAddress;
import a.entities.Coupon;
import a.entities.Review;
import a.entities.Student;
import a.entities.University;

public class App4 {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().addAnnotatedClass(CompanyAddress.class)
				.addAnnotatedClass(Student.class).addAnnotatedClass(Review.class).addAnnotatedClass(Coupon.class)
				.addAnnotatedClass(Company.class).addAnnotatedClass(University.class).buildSessionFactory();
		Session session = factory.getCurrentSession();

		try {
			session.getTransaction().begin();
			// =====================================
			{
				University u1 = new University("Ben Gurions", "Isearl");
				University u2 = new University("MIT", "USA");
				session.save(u1);
				session.save(u2);
			}
			// =====================================
			session.getTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		} finally {
			session.close();
			factory.close();
		}
	}
}
