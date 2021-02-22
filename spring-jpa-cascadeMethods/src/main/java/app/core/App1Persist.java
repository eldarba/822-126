package app.core;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import app.core.entity.Student;
import app.core.entity.University;

@SpringBootApplication
public class App1Persist {

	public static void main(String[] args) throws InterruptedException {

		// get spring context
		ApplicationContext ctx = SpringApplication.run(App1Persist.class, args);

		// get EM factory
		EntityManagerFactory factory = ctx.getBean(EntityManagerFactory.class);
		// get EM
		EntityManager em = factory.createEntityManager();

		try {
			// start transaction
			em.getTransaction().begin();

			// ======= start work ========
			Student st1 = new Student("aaa");
			Student st2 = new Student("bbb");
			Student st3 = new Student("ccc");
			University univ = new University(0, "MIT");
			univ.addStudents(st1, st2, st3);
//			univ.setStudents(Arrays.asList(st1, st2, st3));
			em.persist(univ);
			// ======= end work ==========

			// commit transaction
			em.getTransaction().commit();
			System.out.println("SUCCESS");
		} catch (Exception e) {
			e.printStackTrace(System.out);
			// roll back transaction
			em.getTransaction().rollback();
		} finally {
			// in a JSE app close EM when you no longer need the entities in its context.
			em.close();
		}

	}

}
