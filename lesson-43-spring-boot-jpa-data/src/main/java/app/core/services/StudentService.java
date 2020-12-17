package app.core.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.core.entities.Student;
import app.core.repositories.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;

	// each method would be a business transaction
	@Transactional
	public void m1() {
		System.out.println("number of students:" + studentRepository.count());
		Student s = studentRepository.findById(11).get();
		// set of actions - a busies transaction
	}

}
