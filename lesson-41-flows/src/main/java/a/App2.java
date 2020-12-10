package a;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import a.entities.Company;
import a.entities.CompanyAddress;

public class App2 {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().addAnnotatedClass(CompanyAddress.class)
				.addAnnotatedClass(Company.class).buildSessionFactory();
		Session session = factory.getCurrentSession();

		try {
			session.getTransaction().begin();

			// getting the company will load its address from the address table
//			Company company = session.get(Company.class, 4L);
//
//			System.out.println(company);
//			System.out.println(company.getAddress());
//
//			company.setAddress(null);

//			CompanyAddress address = company.getAddress();

//			session.delete(company); // delete the company will delete the address - cascade
			CompanyAddress address = session.get(CompanyAddress.class, 2L);
			session.delete(address);

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
