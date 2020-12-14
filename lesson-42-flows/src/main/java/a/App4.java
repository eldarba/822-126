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
//				University u1 = new University("Ben Gurions", "Isearl");
//				University u2 = new University("MIT", "USA");
//				session.save(u1);
//				session.save(u2);
			}
			{
//				University u1 = session.get(University.class, 4L);
//				University u2 = session.get(University.class, 2L);
//
//				Student s1 = new Student("aaa", null);
//				Student s2 = new Student("bbb", u1);
//				Student s3 = new Student("ccc", u1);
//				Student s4 = new Student("ddd", u2);
//				Student s5 = new Student("eee", u2);
//
//				session.save(s1);
//				session.save(s2);
//				session.save(s3);
//				session.save(s4);
//				session.save(s5);
			}
			{
//				Student s = session.get(Student.class, 3L);
//				System.out.println(s);
//				System.out.println(s.getUniversity());
			}
			{
//				University u1 = session.get(University.class, 1L);
//				TypedQuery<Student> q = session.createQuery("from Student s where s.university.id=:id", Student.class);
//				q.setParameter("id", u1.getId());
//				List<Student> list = q.getResultList();
//				System.out.println(list);
//				for (Student student : list) {
//					student.setUniversity(null);
//				}
			}

			{
//				University u1 = session.get(University.class, 1L);
//				session.delete(u1);

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
