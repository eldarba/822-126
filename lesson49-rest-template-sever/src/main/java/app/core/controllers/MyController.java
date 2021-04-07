package app.core.controllers;

import java.time.LocalDate;
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

import app.core.beans.Person;

@RestController
@RequestMapping("/api")
public class MyController {

	private List<Person> list = new ArrayList<Person>();
	private int nextId = 4;
	{
		list.add(new Person(1, "aaa", 11, 1.8F, LocalDate.of(2010, 5, 15)));
		list.add(new Person(2, "bbb", 22, 1.6F, LocalDate.of(2000, 1, 25)));
		list.add(new Person(3, "ccc", 33, 2F, LocalDate.of(1990, 9, 12)));
	}

	@GetMapping("/greet")
	public String greet() {
		return "Hello from greet";
	}

	@GetMapping("/person/all")
	public List<Person> getAllPersonInList() {
		return list;
	}

	@GetMapping(path = "/person/{id}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public Person getPerson1(@PathVariable int id) {
		for (Person person : list) {
			if (person.getId() == id) {
				return person;
			}
		}
		throw new ResponseStatusException(HttpStatus.NOT_FOUND, "person with id " + id + " not found");
	}

	@GetMapping(path = "/person", produces = { MediaType.APPLICATION_JSON_VALUE })
	public Person getPerson2(@RequestParam int id) {
		return getPerson1(id);
	}

	/**
	 * this method gets a person representation and adds it to the the application
	 * in the server
	 */
	@PostMapping("/person")
	public Person addPerson(@RequestBody Person person) {
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
	public Person updatePerson(@RequestBody Person person) {
		Person p;
		if (person != null && (p = getPerson1(person.getId())) != null) {
			p.setAge(person.getAge());
			p.setBirthdate(person.getBirthdate());
			p.setHeight(person.getHeight());
			p.setName(person.getName());
			return p;
		} else {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "person with id " + person.getId() + " not found");
		}
	}

	@DeleteMapping(path = "/person", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<String> deletePerson(@RequestParam int id) {
		Person p = new Person();
		p.setId(id);
		if (this.list.remove(p)) {
			return ResponseEntity.status(HttpStatus.OK).body("person with id " + id + " deleted");
		} else {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "person with id " + id + " not found");
		}
	}

//	@GetMapping("/person")
//	public Person getPerson() {
//		return new Person(1, "aaa", 11, 1.8F, LocalDate.of(2010, 5, 15));
//	}
}
