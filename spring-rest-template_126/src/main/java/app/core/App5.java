package app.core;

import org.springframework.web.client.RestTemplate;

public class App5 {

	public static void main(String[] args) {

		System.out.println("hello");

		// with this object we can make requests to web services
		try {
			RestTemplate restTemplate = new RestTemplate();
			String url = "http://localhost:8080/api/employees/wrapped";

			EmployeeListWrapper wrapper = restTemplate.getForObject(url, EmployeeListWrapper.class);
			System.out.println(wrapper.getEmps());

		} catch (Exception e) {
			System.out.println("Error");
			System.out.println(e);
		}

	}

}
