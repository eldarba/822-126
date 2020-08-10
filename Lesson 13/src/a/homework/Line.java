package a.homework;

public class Line {
	
	private int length;

	public Line(int length) {
		super();
		this.length = length;
	}
	
	
	public void draw() {
		for (int i = 0; i < length; i++) {
			System.out.print(" * ");
		}
		System.out.println();
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
	

}
