package app.core.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import app.core.entities.Employee;
import app.core.repositories.EmployeeRepository;

@RestController
@RequestMapping(path = "/api")
public class EmployeeController {

	private EmployeeRepository repo;

	public EmployeeController(EmployeeRepository repo) {
		super();
		this.repo = repo;
	}

//	// http://localhost:8080/api/employees/xml
//	@RequestMapping(path = "/employees/xml", method = RequestMethod.GET, produces = MediaType.APPLICATION_XML_VALUE)
//	public List<Employee> getAllEmployeesXML() {
//		return repo.findAll();
//	}

	// http://localhost:8080/api/employees/json
	@RequestMapping(path = "/employees/json", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getAllEmployeesJSON() {
		return repo.findAll();
	}

	// http://localhost:8080/api/employees
	@GetMapping("/employees")
	public List<Employee> getAllEmployees() {
		return repo.findAll();
	}

	// http://localhost:8080/api/employees/101
	@GetMapping("/employees/{id}")
	public ResponseEntity<?> getOneEmployee(@PathVariable Long id) {
		try {
			Optional<Employee> opt = repo.findById(id);
			if (opt.isPresent()) {
				Employee employee = opt.get();
				return ResponseEntity.ok(employee);
			} else {
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body("employee with id " + id + " not found");
			}
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("get employee failed");
		}

	}

	// http://localhost:8080/api/employees/one?id=101
	@GetMapping("/employees/one")
	public Employee getOneEmployeeByParam(@RequestParam Long id) {
		return repo.getOne(id);
	}

	@PostMapping("/employees/add")
	public Employee addEmployee(@RequestBody Employee employee) {
		return repo.save(employee);
	}

}
