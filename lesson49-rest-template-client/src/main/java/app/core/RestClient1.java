package app.core;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class RestClient1 {

	public static void main(String[] args) {
		System.out.println("client program start");

		// an object for making client requests
		RestTemplate restTemplate = new RestTemplate();
		// define a request url
		String url = "http://localhost:8080/api/greet";

		ResponseEntity<String> res = null;
		try {
			// make the request and get the response
			res = restTemplate.getForEntity(url, String.class);
			System.out.println("===============================");
			System.out.println(res.getStatusCode());
			System.out.println(res.getBody());

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

}
