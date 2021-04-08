package app.core;

import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import app.core.beans.Person;

@SpringBootApplication
public class ProductsWebsiteSpring1Application {

	public static void main(String[] args) {

		try {
			// create a RestTemplate instance
			RestTemplate rt = new RestTemplate();
			String url;

//			{
//				// GET one person - using exchange method
//				url = "http://localhost:8080/api/person/22";
//				ResponseEntity<Person> resp = rt.exchange(url, HttpMethod.GET, null, Person.class);
//				Person person = resp.getBody();
//				System.out.println(person);
//			}

			{
				// GET all persons - using exchange method
				url = "http://localhost:8080/api/person/all";
				ParameterizedTypeReference<List<Person>> type = new ParameterizedTypeReference<List<Person>>() {
				};
				ResponseEntity<List<Person>> resp = rt.exchange(url, HttpMethod.GET, null, type);
				List<Person> list = resp.getBody();
				System.out.println(list);
			}

//			{
//				// POST a person - using exchange method
//				url = "http://localhost:8080/api/person";
//				// the person to post
//				Person person = new Person(0, "Nimrod", 28, 1.75F, LocalDate.of(1994, 1, 18));
//				// encapsulate the String url in a URI object
//				// the request entity
//				RequestEntity<Person> requestEntity = new RequestEntity<Person>(person, HttpMethod.POST, uri);
//				// exchange: send request and get a response
//				ResponseEntity<Person> resp = rt.exchange(requestEntity, Person.class);
//				// extract the response body
//				person = resp.getBody();
//				System.out.println(person);
//			}

//			{
//				// PUT (update) person - using exchange method
//				url = "http://localhost:8080/api/person";
//				// the person to update
//				Person person = new Person(47, "Nimrod Kohen", 30, 1.85F, LocalDate.of(1994, 1, 18));
//				URI uri = new URI(url);
//				RequestEntity<Person> req = new RequestEntity<Person>(person, HttpMethod.PUT, uri);
//				person = rt.exchange(req, Person.class).getBody();
//				System.out.println(person);
//			}

//			{
//				// DELETE a person - using exchange method
//				url = "http://localhost:8080/api/person?id=2";
//				URI uri = new URI(url);
//				RequestEntity<Person> req = new RequestEntity<Person>(HttpMethod.DELETE, uri);
//				String resp = rt.exchange(req, String.class).getBody();
//				System.out.println(resp);
//			}

		} catch (Exception e) {
			System.err.println("========= ERROR ==============");
			System.err.println(e.getMessage());
		}

	}

}
