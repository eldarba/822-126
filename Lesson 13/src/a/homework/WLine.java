package a.homework;

public class WLine extends Line {
	
	private int width;
	
	public WLine(int length, int width) {
		super(length);
		this.width = width;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	@Override
	public void draw() {
		for (int i = 0; i < width; i++) {
			super.draw();
		}
	}
	


}
