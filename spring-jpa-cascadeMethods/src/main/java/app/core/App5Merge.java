package app.core;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import app.core.entity.Student;
import app.core.entity.University;

@SpringBootApplication
public class App5Merge {

	public static void main(String[] args) throws InterruptedException {

		// get spring context
		ApplicationContext ctx = SpringApplication.run(App5Merge.class, args);
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
				System.out.println(">>> entity persistent? " + em.contains(univ));
				for (Student student : univ.getStudents()) {
					System.out.println(">>> associate entity persistent? " + em.contains(student));
				}
				em.detach(univ);
				System.out.println("===============");
				System.out.println(">>> entity persistent? " + em.contains(univ));
				for (Student student : univ.getStudents()) {
					System.out.println(">>> associate entity persistent? " + em.contains(student));
				}

//				change detached entity and MERGE
				univ.setName(univ.getName() + "---");
				System.out.println(univ);
//				MERGE
				univ = em.merge(univ);
				System.out.println("===============");
				System.out.println(">>> entity persistent? " + em.contains(univ));
				for (Student student : univ.getStudents()) {
					System.out.println(">>> associate entity persistent? " + em.contains(student));
				}
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
