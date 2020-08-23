package a;

/**
 * A person instance has id, name and age. The id must never be of a negative
 * value
 */
public class Person {

	// fields
	private int id; // visible in this class only
	protected String name; // visible from any sub class
	int age; // default (package private) - visible in the package only

	// methods
	public String getDetails() { // public is visible from everywhere
		return "person[id: " + id + ", name: " + name + ", age: " + age + "]";
	}

	public void setId(int val) {
		if (val >= 0) {
			id = val;
		}
	}	
}
