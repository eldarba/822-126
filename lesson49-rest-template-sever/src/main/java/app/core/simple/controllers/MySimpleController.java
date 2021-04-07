package app.core.simple.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import app.core.simple.beans.PersonListWrapper;
import app.core.simple.beans.PersonSimple;

@RestController
@RequestMapping("/api/simple")
public class MySimpleController {

	private List<PersonSimple> list = new ArrayList<PersonSimple>();
	private int nextId = 4;
	{
		list.add(new PersonSimple(1, "aaa", 11));
		list.add(new PersonSimple(2, "bbb", 22));
		list.add(new PersonSimple(3, "ccc", 33));
	}

	@GetMapping("/greet")
	public String greet() {
		return "Hello from greet";
	}

	@GetMapping("/person/all/wrapper")
	public PersonListWrapper getAllPersonInWrapper() {
		PersonListWrapper wrapper = new PersonListWrapper();
		wrapper.setPersons(list);
		return wrapper;
	}

	@GetMapping("/person/all")
	public List<PersonSimple> getAllPersonInList() {
		return list;
	}

	@GetMapping(path = "/person/{id}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public PersonSimple getPerson1(@PathVariable int id) {
		for (PersonSimple person : list) {
			if (person.getId() == id) {
				return person;
			}
		}
		throw new ResponseStatusException(HttpStatus.NOT_FOUND, "person with id " + id + " not found");
	}

	@GetMapping(path = "/person", produces = { MediaType.APPLICATION_JSON_VALUE })
	public PersonSimple getPerson2(@RequestParam int id) {
		return getPerson1(id);
	}

	/**
	 * this method gets a person representation and adds it to the the application
	 * in the server
	 */
	@PostMapping("/person")
	public PersonSimple addPerson(@RequestBody PersonSimple person) {
		if (person != null) {
			person.setId(nextId++);
			list.add(person);
			System.out.println(list);
			return person;
		} else {
			return null;
		}
	}

	/**
	 * this method gets a person representation and update it if found in the server
	 */
	@PutMapping("/person")
	public PersonSimple updatePerson(@RequestBody PersonSimple person) {
		PersonSimple p;
		if (person != null && (p = getPerson1(person.getId())) != null) {
			p.setAge(person.getAge());
			p.setName(person.getName());
			return p;
		} else {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "person with id " + person.getId() + " not found");
		}
	}

	@DeleteMapping(path = "/person", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<String> deletePerson(@RequestParam int id) {
		PersonSimple p = new PersonSimple();
		p.setId(id);
		if (this.list.remove(p)) {
			return ResponseEntity.status(HttpStatus.OK).body("person with id " + id + " deleted");
		} else {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "person with id " + id + " not found");
		}
	}

//	@GetMapping("/person")
//	public Person getPerson() {
//		return new Person(1, "aaa", 11);
//	}
}
