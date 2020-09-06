package b;

public abstract class Vehicle {

	private String color;

	public Vehicle() {
	}

	public Vehicle(String color) {
		super();
		this.color = color;
		System.out.println("from Vehicle CTOR");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public abstract void drive();

}
