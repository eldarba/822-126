package app.core.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import app.core.entities.Employee;
import app.core.repositories.EmployeeRepository;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	private EmployeeRepository repo;

	public EmployeeController(EmployeeRepository repo) {
		super();
		this.repo = repo;
	}

	// http://localhost:8080/api/employees
	@RequestMapping(path = "/employees", method = RequestMethod.GET)
	public List<Employee> getAllEmployees() {
		return repo.findAll();
	}

}
