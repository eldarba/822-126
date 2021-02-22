package app.core.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import app.core.entity.Student;
import app.core.entity.University;

@Service
public class DemoService {

	@PersistenceUnit
	private EntityManagerFactory factory;

	@PersistenceContext
	private EntityManager emShared;

	public void demoCascadePersistManualTransaction() {
		EntityManager emPrivate = factory.createEntityManager();
		emPrivate.getTransaction().begin();
		try {
			University u = new University(0, "MIT");
			u.addStudents(new Student(0, "aaa"));
			u.addStudents(new Student(0, "bbb"));
			u.addStudents(new Student(0, "ccc"));
			emPrivate.persist(u);
			emPrivate.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			emPrivate.getTransaction().rollback();
		}
	}

	@Transactional // required
	public void demoCascadePersist() {
		University u = new University(0, "MIT");
		u.addStudents(new Student(0, "aaa"));
		u.addStudents(new Student(0, "bbb"));
		u.addStudents(new Student(0, "ccc"));
		emShared.persist(u);
	}

	@Transactional // required
	public void demoCascadeRemove(int univId) {
		University u = emShared.find(University.class, univId);
		emShared.remove(u);
	}

	@Transactional // optional (if not - no session)
	public void demoCascadeDetach(int univId) {
		System.out.println(">>> em joined to session: " + emShared.isJoinedToTransaction());
		System.out.println(">>> em is open: " + emShared.isOpen());
		University u = emShared.find(University.class, univId);
		System.out.println(">>> entity persistent: " + emShared.contains(u));
		for (Student s : u.getStudents()) {
			System.out.println(">>>-- associated entity persistent: " + emShared.contains(s));
		}
		emShared.detach(u);
		System.out.println(">>> entity persistent: " + emShared.contains(u));
		for (Student s : u.getStudents()) {
			System.out.println(">>>-- associated entity persistent: " + emShared.contains(s));
		}
	}

	@Transactional // required
	public void demoMerge(int univId) {
		University u = emShared.find(University.class, univId);

	}

}
