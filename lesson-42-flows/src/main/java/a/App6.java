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
//				// create the coupons
//				Coupon coupon1 = new Coupon("aaa");
//				Coupon coupon2 = new Coupon("bbb");
//				Coupon coupon3 = new Coupon("ccc");
//				// create the customers
//				Customer customer1 = new Customer("Dan", "dan@email");
//				Customer customer2 = new Customer("Ariela", "ariela@email");
//				// add the customers to the coupons
//				coupon1.addCustomer(customer1);
//				coupon1.addCustomer(customer2);
//				coupon2.addCustomer(customer2);
//
//				// save all
//				session.persist(coupon1);
//				session.persist(coupon2);
//				session.persist(coupon3);
			}
			{
//				Customer customer = session.find(Customer.class, 2L);
//				System.out.println(customer);
//				if (customer != null) {
//					System.out.println(customer.getCoupons());
//				}
			}
			{
//				Coupon coupon = session.find(Coupon.class, 1L);
//				System.out.println(coupon);
//				if (coupon != null) {
//					System.out.println(coupon.getCustomers());
//				}
			}

			{
				Coupon c = new Coupon();
				c.setId(1L);
				session.remove(c);
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
