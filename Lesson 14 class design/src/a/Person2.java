package a;

public class Person2 {

	private int id;
	private String name;
	private int age;

	public Person2(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person2 [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		// instancof operator: used for checking if a reference points to a type
		if (!(obj instanceof Person2)) {
			return false;
		}
		Person2 other = (Person2) obj;
		if (id != other.id) {
			return false;
		}
		return true;
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println(this + " is going to be GCed");
	}

}
