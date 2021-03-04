package app.core;

import org.springframework.web.client.RestTemplate;

import app.core.models.Employee;

public class App126 {

	public static void main(String[] args) {
		System.out.println("hi");

		RestTemplate rt = new RestTemplate();
		String url = "http://localhost:8080/api/employees/one?id=1";
		Employee e = rt.getForObject(url, Employee.class);
		System.out.println(e);

	}

}
