package app.core.beans;

import java.util.Objects;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("thePerson")
@Scope("prototype")  // prototypes are always lazily loaded
public class Person {
	
	private int id;
	private String name;
	private int age;
	
	{
		System.out.println("Person created");
	}
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Person)) {
			return false;
		}
		Person other = (Person) obj;
		return id == other.id;
	}
	
	
	
	

}
