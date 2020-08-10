package c.finalDemo;

public class Person {

	public final int id;
	private String name;

	public Person(int id) {
		this.id = id;
	}

	public final void sayHi() {
		System.out.println("Hi");
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

}
