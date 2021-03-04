package app.core;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

public class App4 {

	public static void main(String[] args) {

		System.out.println("hello");

		// with this object we can make requests to web services
		try {
			RestTemplate restTemplate = new RestTemplate();
			String url = "http://localhost:8080/api/employees";
			ResponseEntity<String> resp = restTemplate.getForEntity(url, String.class);
			System.out.println(resp.getBody());

			ObjectMapper mapper = new ObjectMapper();
			List emps = mapper.readValue(resp.getBody(), List.class);

			System.out.println("================");
			for (Object employee : emps) {
				System.out.println(employee);
			}
			System.out.println("================");
		} catch (Exception e) {
			System.out.println("Error");
			System.out.println(e);
		}

	}

}
