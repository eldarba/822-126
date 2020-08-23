package c;

public class Rectangle extends Shape {

	private double length;
	private double width;
	
	public Rectangle(String color, double length, double width) {
		super(color);
		this.length = length;
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	// override the method from the super class
	@Override
	public double getArea() {
		return this.length * this.width;
	}
}
