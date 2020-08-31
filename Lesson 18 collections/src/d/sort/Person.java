package d.sort;

/** natural order is id */
public class Person implements Comparable<Person> {

	private int id;
	private String name;
	private int age;

	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	// define the natural order
	@Override
	public int compareTo(Person other) {
		if (this.id < other.id) {
			return -1;
		} else if (this.id > other.id) {
			return 1;
		} else {
			return 0;
		}
	}

	// just testing
	public static void main(String[] args) {
		Person p1 = new Person(22, "aaa", 22);
		Person p2 = new Person(50, "aaa", 22);

		System.out.println(p1.compareTo(p2));
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

}
