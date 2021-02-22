package app.core;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import app.core.entity.University;

@SpringBootApplication
public class App3Remove {

	public static void main(String[] args) throws InterruptedException {

		// get spring context
		ApplicationContext ctx = SpringApplication.run(App3Remove.class, args);
		// get EM factory
		EntityManagerFactory factory = ctx.getBean(EntityManagerFactory.class);
		// get EM
		EntityManager em = factory.createEntityManager();

		try {
			// start transaction
			em.getTransaction().begin();

			// ======= start work ========
			University univ = em.find(University.class, 1);
			System.out.println(univ);
			if (univ != null) {
				em.remove(univ);
			}
			// ======= end work ==========

			// commit transaction
			em.getTransaction().commit();
			System.out.println("SUCCESS");
		} catch (Exception e) {
			e.printStackTrace(System.out);
			// roll back transaction
			em.getTransaction().rollback();
		} finally {
			em.close();
		}

	}

}
