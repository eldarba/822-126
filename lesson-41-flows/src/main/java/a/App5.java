package a;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import a.entities.Company;
import a.entities.CompanyAddress;
import a.entities.Coupon;
import a.entities.Review;
import a.entities.Student;
import a.entities.University;

public class App5 {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().addAnnotatedClass(CompanyAddress.class)
				.addAnnotatedClass(Student.class).addAnnotatedClass(Review.class).addAnnotatedClass(Coupon.class)
				.addAnnotatedClass(Company.class).addAnnotatedClass(University.class).buildSessionFactory();
		Session session = factory.getCurrentSession();

		try {
			session.getTransaction().begin();
			// =====================================
			{
//				// get a university
//				University u1 = session.get(University.class, 4L);
//				// get students
//				Student s1 = session.get(Student.class, 1L);
//				Student s2 = session.get(Student.class, 2L);
//				// bind the students to the university
//				s1.setUniversity(u1);
//				s2.setUniversity(u1);
			}
			{
				// get a university
				University u1 = session.get(University.class, 2L);
				List<Student> students = u1.getStudents();
				System.out.println(students);

				session.delete(u1);
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
