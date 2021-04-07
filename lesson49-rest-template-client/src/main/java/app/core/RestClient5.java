package app.core;

import java.util.List;

import org.springframework.web.client.RestTemplate;

import app.core.beans.simple.Person;
import app.core.beans.simple.PersonListWrapper;

public class RestClient5 {

	public static void main(String[] args) {

		RestTemplate restTemplate = new RestTemplate();
		String urlList = "http://localhost:8080/api/person/all/list";
		String urlWrapper = "http://localhost:8080/api/person/all/wrapper";

		try {

			List<?> list = restTemplate.getForObject(urlList, List.class);
			PersonListWrapper personsWrapper = restTemplate.getForObject(urlWrapper, PersonListWrapper.class);

			List<Person> persons = personsWrapper.getPersons();
			System.out.println(persons);

			Object obj = list.get(0);
			Person p = persons.get(0);

			System.out.println(obj);
			System.out.println(p);

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

}
