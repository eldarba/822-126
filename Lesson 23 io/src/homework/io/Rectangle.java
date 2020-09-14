package homework.io;

public class Rectangle {

	private int length;
	private int width;
	private String color;

	public Rectangle(int length, int width) {
		super();
		this.length = length;
		this.width = width;
	}

	public Rectangle(int length, int width, String color) {
		super();
		this.length = length;
		this.width = width;
		this.color = color;
	}

	public int getArea() {
		return length * width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + ", color=" + color + "]";
	}

}
