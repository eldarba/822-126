package d.abstraction;

/*
 * abstract class
 * 
 * 1. cannot be instantiated (objects cannot be created)
 * 
 * 2. used for polymorphism - Shape[] 
 * 
 * 3. can contain concrete methods

 * 4. can contain abstract methods
 * */
public abstract class Shape {

	private String color;

	public Shape(String color) {
		super();
		this.color = color;
	}

	public Shape() {
	}

	// abstract methods can be defined in abstract classes
	public abstract double getArea();

	// concrete methods
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
