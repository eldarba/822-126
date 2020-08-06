package b;

public class Pixel extends Point {

	// attribute
	private String color;

	public Pixel(int x, int y, String color) {
		super(x, y); // invoke another CTOR in super class
		this.color = color;
	}
	
	public Pixel(int x, int y){
		this(x, y, "Black"); // invoke another CTOR in this class
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}


	
	

}
