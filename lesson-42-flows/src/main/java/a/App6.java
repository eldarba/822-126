package a;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import a.entities.Company;
import a.entities.CompanyAddress;
import a.entities.Coupon;
import a.entities.Customer;
import a.entities.Review;
import a.entities.Student;
import a.entities.University;

public class App6 {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().addAnnotatedClass(CompanyAddress.class)
				.addAnnotatedClass(Customer.class).addAnnotatedClass(Student.class).addAnnotatedClass(Review.class)
				.addAnnotatedClass(Coupon.class).addAnnotatedClass(Company.class).addAnnotatedClass(University.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();

		try {
			session.getTransaction().begin();
			// =====================================
			{

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
