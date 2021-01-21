package app.core;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

import app.core.beans.Person;

public class RestClient2 {

	public static void main(String[] args) {
		System.out.println("client program start");

		// an object for making client requests
		RestTemplate restTemplate = new RestTemplate();
		// define a request url
		String url = "http://localhost:8080/api/person";

		ResponseEntity<String> res = null;
		try {
			// make the request and get the response
			res = restTemplate.getForEntity(url, String.class);
			System.out.println("===============================");
			System.out.println(res.getStatusCode());
			System.out.println(res.getBody());

			// using jackson
			/*
			 * https://camel.apache.org/components/latest/dataformats/json-jackson-
			 * dataformat.html
			 */
			ObjectMapper mapper = new ObjectMapper();
			// json to object
			System.out.println("=== convert JSON to Java Object");
			String json = res.getBody();
			Person p = mapper.readValue(json, Person.class);
			System.out.println(p.getId());
			System.out.println(p.getName());
			System.out.println(p.getAge());
			System.out.println(p);
			// object to json
			System.out.println("=== convert Java Object to JSON ");
			json = mapper.writeValueAsString(p);
			System.out.println(json);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

}
