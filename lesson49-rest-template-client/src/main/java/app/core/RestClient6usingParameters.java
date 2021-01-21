package app.core;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.client.RestTemplate;

import app.core.beans.Person;

public class RestClient6usingParameters {

	public static void main(String[] args) {
		System.out.println("client program start");
		RestTemplate restTemplate = new RestTemplate();
//		String url = "http://localhost:8080/api/person/2";
		String url = "http://localhost:8080/api/person/{id}";

		Map<String, String> params = new HashMap<>();
		params.put("id", "2");

		try {
			Person person = restTemplate.getForObject(url, Person.class, params);
			System.out.println(person);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

}
