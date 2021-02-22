package app.core.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api")
public class MyController {

	private Map<Integer, Person> personMap = new HashMap<Integer, Person>();

	@GetMapping("/greet")
	public String greet() {
		return "Hello user";
	}

	@PostMapping("person")
	public String addPerson(@RequestBody Person person) {
		personMap.put(person.getId(), person);
		return "person added";
	}

	@GetMapping("/person/{id}")
	public Person getPerson(@PathVariable int id) {
		if (personMap.containsKey(id)) {
			return personMap.get(id);
		} else {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "not in system");
		}
	}
}
