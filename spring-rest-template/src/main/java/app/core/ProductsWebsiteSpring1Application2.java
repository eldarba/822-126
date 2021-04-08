package app.core;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import app.core.beans.Person;

@SpringBootApplication
public class ProductsWebsiteSpring1Application2 {

	public static void main(String[] args) {

		try {
			// create a RestTemplate instance
			RestTemplate rt = new RestTemplate();
			String url;

//			{
//				// GET one person - using getForObject method
//				url = "http://localhost:8080/api/person/1";
//				Person person = rt.getForObject(url, Person.class);
//				System.out.println(person);
//			}

//			{
//				// GET all persons - using getForObject method - not so good if we need the
//				// entities as Person
//				url = "http://localhost:8080/api/person/all";
//				// the list we get is not of Person but of Map
//				List<?> list = rt.getForObject(url, List.class);
//				System.out.println(list);
//
//				// each person is a map
//				Map<?, ?> personAsMap = (Map<?, ?>) list.get(0);
//				System.out.println(personAsMap);
//
//				Person person = new Person();
//				person.setId((int) personAsMap.get("id"));
//				person.setName(personAsMap.get("name").toString());
//				System.out.println(person);
//			}

//			{
//				// POST a person - using postForObject method
//				url = "http://localhost:8080/api/person";
//				// the person to post
//				Person person = new Person(0, "Danna", 26, 1.75F, LocalDate.of(1994, 1, 18));
//				person = rt.postForObject(url, person, Person.class);
//				System.out.println(person);
//			}

//			{
//				// PUT (update) person - using put method
//				url = "http://localhost:8080/api/person";
//				// the person to update
//				Person person = new Person(5, "Danna Isreli", 27, 1.75F, LocalDate.of(1994, 1, 18));
//				rt.put(url, person); // void
//				System.out.println("updated");
//			}

//			{
//				// DELETE a person - using delete method
//				url = "http://localhost:8080/api/person?id=3";
//				rt.delete(url); // void
//				System.out.println("deleted");
//			}

			// using URI variables
//			{
//				url = "http://localhost:8080/api/person?id={id}";
//				int id = Integer.parseInt(JOptionPane.showInputDialog("enter id"));
//				Person p = rt.getForObject(url, Person.class, id);
//				System.out.println(p);
//			}
			// using URI variables
//			{
//				url = "http://localhost:8080/api/person?{param}={val}";
//				String param = "id";
//				int val = Integer.parseInt(JOptionPane.showInputDialog("enter id"));
//				Person p = rt.getForObject(url, Person.class, param, val);
//				System.out.println(p);
//			}

			// using URI variables in a map
			{
				url = "http://localhost:8080/api/person?{param}={val}";
				String param = "id";
				int val = Integer.parseInt(JOptionPane.showInputDialog("enter id"));

				Map<String, Object> mapOfVars = new HashMap<String, Object>();
				mapOfVars.put("param", param);
				mapOfVars.put("val", val);

				Person p = rt.getForObject(url, Person.class, mapOfVars);
				System.out.println(p);
			}

		} catch (Exception e) {
			System.err.println("========= ERROR ==============");
			System.err.println(e.getMessage());
		}

	}

}
