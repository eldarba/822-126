package app.core.beans;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component // singletons are eagerly loaded
@Scope("singleton") // singleton is default
@Lazy
public class School {

	private List<Person> persons = new ArrayList<Person>();
	{
		System.out.println("School created");
	}

	public void add(Person person) {
		persons.add(person);
	}

	public Person getPerson(int id) {
		Person p = new Person();
		p.setId(id);
		int index = persons.indexOf(p);
		return index != -1 ? persons.get(index) : null;
	}

	public void evacuate() {
		persons.clear();
	}
}
