package app.core.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import app.core.entities.Student;

@Repository
@Transactional
public class StudentDaoImpl implements StudentDao {

	@PersistenceContext // inject - like autowired
	private EntityManager em; // like Hibernate Session

	@Override
	public Integer save(Student student) {
		em.persist(student);
		return student.getId();
	}

	@Override
	public Student get(Integer id) {
		return em.find(Student.class, id);
	}

	@Override
	public boolean update(Student student) {
		Student studentFromDb = em.find(Student.class, student.getId());
		if (studentFromDb != null) {
			studentFromDb.setEmail(student.getEmail());
			studentFromDb.setGender(student.getGender());
			studentFromDb.setName(student.getName());
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean delete(Integer id) {
		Student s = get(id);
		if (s != null) {
			em.remove(s);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public List<Student> findAll() {
		return em.createQuery("from Student", Student.class).getResultList();
	}

}
