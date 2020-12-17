package app.core.repositories;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import app.core.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	List<Student> findByAgeBetween(Integer age1, Integer age2);

	List<Student> findByActiveTrue();

	List<Student> findByActiveFalse();

	List<Student> findByName(String name);

	Long countByAge(Integer age);

	@Query("from Student s where s.gender='M'")
	List<Student> getAllMaleStudents();

	@Query(value = "select from Student s where gender='M'", nativeQuery = true)
	List<Student> getAllMaleStudents2();

	@Query("from Student s where s.gender='F'")
	List<Student> getAllFemaleStudents();

	@Query("from Student s where s.gender='F'")
	List<Student> getAllFemaleStudents(Sort sort);

	// use query parameter
	@Query("from Student where age > :age")
	List<Student> getAllStudentsOlderThan(int age);

}
