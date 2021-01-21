package app.core;

import org.springframework.web.client.RestTemplate;

import app.core.beans.Person;

public class RestClient4 {

	public static void main(String[] args) {
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8080/api/person";

		try {
			Person person = new Person(0, "Danna", 44);
			// with a POST request we can send a representation to be added to the server
			person = restTemplate.postForObject(url, person, Person.class);
			System.out.println(person);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

}
