package app.core.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import app.core.session.Session;
import app.core.session.SessionContext;

@RestController
@RequestMapping("/api")
public class MyController {

	private Map<Integer, Person> personMap = new HashMap<Integer, Person>();
	@Autowired
	private SessionContext sessionContext;

	@GetMapping("/greet")
	public String greet(@RequestHeader String token) {
		return "Hello user";
	}

	@GetMapping("/greet2")
	public String greet2(@RequestHeader String token) {
		Session session = sessionContext.getSession(token);
		if (session != null) {
			return "Hello " + session.getAttribute("userName");
		}
		return "Hello unlogged user";
	}

	@PostMapping("/person")
	public String addPerson(@RequestHeader String token, @RequestBody Person person) {
		personMap.put(person.getId(), person);
		return "person added";
	}

	@GetMapping("/person/{id}")
	public Person getPerson(@RequestHeader String token, @PathVariable int id) {
		if (personMap.containsKey(id)) {
			return personMap.get(id);
		} else {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "not in system");
		}
	}
}
