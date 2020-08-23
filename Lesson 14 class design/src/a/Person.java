package a;

public class Person {

	private int id;
	private String name;
	private int age;

	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	// overriding method is defining it again in the subclass

	// object methods we usually override
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) {
		Person p = new Person(101, "aaa", 25);
		System.out.println(p);
	}

	// convert an object to int
	@Override
	public int hashCode() {
		return 102 + id * 12;
	}

	// check for quality between this object and another object
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Person)) {
			return false;
		}
		Person other = (Person) obj;
		return this.id == other.id;
	}

}
