package app.core;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.core.beans.Person;
import app.core.beans.PersonListWrapper;

@RestController
@RequestMapping("/api")
public class MyController {

	private List<Person> list = new ArrayList<Person>();
	private int nextId = 4;
	{
		list.add(new Person(1, "aaa", 11));
		list.add(new Person(2, "bbb", 22));
		list.add(new Person(3, "ccc", 33));
	}

	@GetMapping("/greet")
	public String greet() {
		return "Hello from greet";
	}

	@GetMapping("/person/all/wrapper")
	public PersonListWrapper getAllPerson1() {
		PersonListWrapper wrapper = new PersonListWrapper();
		wrapper.setPersons(list);
		return wrapper;
	}

	@GetMapping("/person/all/list")
	public List<Person> getAllPerson2() {
		return list;
	}

	@GetMapping(path = "/person/{id}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public Person getPerson2(@PathVariable int id) {
		for (Person person : list) {
			if (person.getId() == id) {
				return person;
			}
		}
		return null;
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

	@GetMapping("/person")
	public Person getPerson() {
		return new Person(101, "Dan", 33);
	}
}
