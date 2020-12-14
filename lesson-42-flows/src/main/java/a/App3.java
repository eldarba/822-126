package a;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import a.entities.Company;
import a.entities.CompanyAddress;
import a.entities.Coupon;
import a.entities.Review;

public class App3 {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().addAnnotatedClass(CompanyAddress.class)
				.addAnnotatedClass(Review.class).addAnnotatedClass(Coupon.class).addAnnotatedClass(Company.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();

		try {
			session.getTransaction().begin();
			// =====================================
			{
//				Coupon c1 = new Coupon("aaa");
//				c1.addReview(new Review("comentA1"));
//				c1.addReview(new Review("comentA2"));
//				c1.addReview(new Review("comentA3"));
//
//				Coupon c2 = new Coupon("bbb");
//				c2.addReview(new Review("comentB1"));
//				c2.addReview(new Review("comentB2"));
//
//				session.save(c1);
//				session.save(c2);
			}

			{
//				Coupon c = session.get(Coupon.class, 2L);
//				System.out.println(c);
//				System.out.println(c.getReviews());
			}

			{
				Coupon c = session.get(Coupon.class, 2L);
				session.delete(c);
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
