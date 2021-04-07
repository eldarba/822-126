package app.core.simple.beans;

import java.util.Objects;

public class PersonSimple {

	private int id;
	private String name;
	private int age;

	public PersonSimple() {
		// TODO Auto-generated constructor stub
	}

	public PersonSimple(int id, String name, int age) {
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
		if (!(obj instanceof PersonSimple)) {
			return false;
		}
		PersonSimple other = (PersonSimple) obj;
		return id == other.id;
	}

}
