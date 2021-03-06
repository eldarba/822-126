package core.app.classes;

public class Person {
	
	// fields
	private int id;
	private String name;
	private int age;
	
	// default CTOR
	public Person() {
	}
	
	{System.out.println("person creation");}
	

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
	
	

}
