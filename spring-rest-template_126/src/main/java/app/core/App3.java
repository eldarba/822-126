package app.core;

import org.springframework.web.client.RestTemplate;

import app.core.models.Employee;

public class App3 {

	public static void main(String[] args) {

		System.out.println("hello");

		// with this object we can make requests to web services
		try {
			RestTemplate restTemplate = new RestTemplate();
			String url = "http://localhost:8080/api/employees";
			Employee e = restTemplate.postForObject(url, new Employee(0, "Dor", "Developer"), Employee.class);
			System.out.println(e);
		} catch (Exception e) {
			System.out.println("Error");
			System.out.println(e);
		}

	}

}
