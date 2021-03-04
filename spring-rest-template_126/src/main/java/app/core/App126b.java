package app.core;

import org.springframework.web.client.RestTemplate;

import app.core.models.Employee;

public class App126b {

	public static void main(String[] args) {

		RestTemplate rt = new RestTemplate();
		String url = "http://localhost:8080/api/employees";
		Employee emp = new Employee(0, "Dina", "Engineer");
		emp = rt.postForObject(url, emp, Employee.class);
		System.out.println(emp);

	}

}
