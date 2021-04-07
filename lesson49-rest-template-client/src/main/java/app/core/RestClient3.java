package app.core;

import org.springframework.web.client.RestTemplate;

import app.core.beans.simple.Person;

public class RestClient3 {

	public static void main(String[] args) {
		System.out.println("client program start");
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8080/api/person/2";

		try {
			Person person = restTemplate.getForObject(url, Person.class);
			System.out.println(person);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

}
