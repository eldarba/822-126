package a.homework;

public class Test2 {

	public static void main(String[] args) {
		
		// create a line
		WLine thickLine = new WLine(10, 2);
		System.out.println("dimensions: " + thickLine.getLength() + " x " + thickLine.getWidth());
		thickLine.draw();
		System.out.println("================");
		
		// set length and width
		thickLine.setLength(5);
		thickLine.setWidth(3);
		System.out.println("dimensions: " + thickLine.getLength() + " x " + thickLine.getWidth());
		thickLine.draw();
		
		

	}

}
