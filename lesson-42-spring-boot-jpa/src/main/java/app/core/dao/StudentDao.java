package app.core.dao;

import java.util.List;

import app.core.entities.Student;

public interface StudentDao {

	Integer save(Student student);

	Student get(Integer id);

	boolean update(Student student);

	boolean delete(Integer id);

	List<Student> findAll();

}
