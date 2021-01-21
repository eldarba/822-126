package app.core;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.core.beans.Person;

@RestController
@RequestMapping("/api")
public class MyController {

	@GetMapping("/greet")
	public String greet() {
		return "Hello from greet";
	}

	@GetMapping(path = "/person", produces = { MediaType.APPLICATION_JSON_VALUE })
	public Person getPerson() {
		return new Person(101, "Dan", 33);
	}

}
