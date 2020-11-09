package core.app.classes;

public class Person {
	
	// fields
	private int id;
	private String name;
	private int age;
	
	// default CTOR
	public Person() {
		System.out.println("Person()");
	}
	
	 
	
	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		System.out.println("Person(int id, String name, int age)");
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
	
	

}
