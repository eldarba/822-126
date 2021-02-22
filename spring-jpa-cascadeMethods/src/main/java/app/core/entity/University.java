package app.core.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class University {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	@OneToMany(cascade = {

			CascadeType.PERSIST, // save a new entity to database

			CascadeType.REMOVE, // remove an entity from database

			CascadeType.DETACH, // remove an entity from current session

			CascadeType.MERGE, // insert an entity to session (update database state)

			CascadeType.REFRESH // updates a persistent entity from database;

	},

//			fetch = FetchType.EAGER,

			mappedBy = "university")
	private List<Student> students;

	public University() {
		super();
	}

	public void addStudents(Student... studentsToAdd) {
		if (this.students == null) {
			this.students = new ArrayList<Student>();
		}
		for (Student student : studentsToAdd) {
			student.setUniversity(this);
			this.students.add(student);
		}
	}

	public University(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		for (Student student : students) {
			student.setUniversity(this);
		}
		this.students = students;
	}

	@Override
	public String toString() {
		return "University [id=" + id + ", name=" + name + "]";
	}

}
