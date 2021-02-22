package app.core;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import app.core.entity.University;

@SpringBootApplication
public class App6Refresh {

	public static void main(String[] args) throws InterruptedException {

		// get spring context
		ApplicationContext ctx = SpringApplication.run(App6Refresh.class, args);
		// get EM factory
		EntityManagerFactory factory = ctx.getBean(EntityManagerFactory.class);
		// get EM
		EntityManager em = factory.createEntityManager();

		try {
			// start transaction
			em.getTransaction().begin();

			// ======= start work ========
			University univ = em.find(University.class, 2);
			System.out.println(univ);
			if (univ != null) {
				System.out.println(univ.getStudents());
				Query query1 = em.createQuery("update University set name = 'FOO'");
				Query query2 = em.createQuery("update Student set name = 'BAR'");
				query1.executeUpdate();
				query2.executeUpdate();
//				REFRESH
				System.out.println(">>> before refresh");
				System.out.println(univ);
				System.out.println(univ.getStudents());
				em.refresh(univ);
				System.out.println(">>> after refresh");
				System.out.println(univ);
				System.out.println(univ.getStudents());
			}

			// ======= end work ==========

			// commit transaction
			em.getTransaction().commit();
			System.out.println("SUCCESS");
		} catch (Exception e) {
			e.printStackTrace(System.out);
			System.out.println("!!! rolling back - " + e.getMessage());
			// roll back transaction
			em.getTransaction().rollback();
		} finally {
			System.out.println(">>> closing");
			em.close();
		}

	}

}
