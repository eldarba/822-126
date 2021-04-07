package app.core.beans;

import java.time.LocalDate;
import java.util.Objects;

public class Person {

	private int id;
	private String name;
	private int age;
	private float height;
	private LocalDate birthdate;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(int id, String name, int age, float height, LocalDate birthdate) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.height = height;
		this.birthdate = birthdate;
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

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public LocalDate getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", height=" + height + ", birthdate="
				+ birthdate + "]";
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
