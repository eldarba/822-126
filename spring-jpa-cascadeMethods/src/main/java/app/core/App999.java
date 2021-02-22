package app.core;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import app.core.entity.University;

@SpringBootApplication
public class App999 {

	public static void main(String[] args) throws InterruptedException {

		// get spring context
		ApplicationContext ctx = SpringApplication.run(App999.class, args);
		// get EM factory
		EntityManagerFactory factory = ctx.getBean(EntityManagerFactory.class);
		// get EM
		EntityManager em = factory.createEntityManager();

		try {
			// start transaction
			em.getTransaction().begin();

			// ======= start work ========
			University univ = em.find(University.class, 1);
			System.out.println(">>> " + univ);
			if (univ != null) {
				System.out.println(">>> start sleep (go and change from workbnech)==================");
				Thread.sleep(15_000);
				System.out.println(">>> " + univ);
				em.refresh(univ); // loaded from cache only
				System.out.println(">>> refresed " + univ);
				em.clear();
				univ = em.find(University.class, 1);
				System.out.println(">>> refetched " + univ);

				// CLOSE SESSION AND START A NEW ONE
				em.close();
				em = factory.createEntityManager();
				em.getTransaction().begin();
				univ = em.find(University.class, 1);
				System.out.println(">>> new session " + univ);
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
