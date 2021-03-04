package app.core;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

import app.core.models.Employee;

public class App1 {

	public static void main(String[] args) {

		System.out.println("hello");

		// with this object we can make requests to web services
		try {
			RestTemplate restTemplate = new RestTemplate();
//			String url = "http://localhost:8080/api/greet";
			String url = "http://localhost:8080/api/employees/one?id=1";
			ResponseEntity<String> resp = restTemplate.getForEntity(url, String.class);
			System.out.println(resp);
			System.out.println(resp.getBody());
			System.out.println(resp.getStatusCodeValue());
			System.out.println(resp.getStatusCode());

			String json = resp.getBody();
			System.out.println(json);

			// use ObjectMapper to do JSON binding
			ObjectMapper mapper = new ObjectMapper();

			// convert JSON to Employee Object
			Employee e = mapper.readValue(json, Employee.class);
			System.out.println(e);
			// convert Employee Object to JSON
			String backToJSON = mapper.writeValueAsString(e);
			System.out.println(backToJSON);

		} catch (Exception e) {
			System.out.println("Error");
			System.out.println(e);
		}

	}

}
