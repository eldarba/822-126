package a.homework;

public class Test1 {

	public static void main(String[] args) {
		
		//create a line instance
		Line line = new Line(5);
		// print length using a get method
		System.out.println("line length: " + line.getLength());
		// print the line, using the draw method
		line.draw();
		
		// set the line length using a set method
		line.setLength(10);
		System.out.println("line length: " + line.getLength());
		line.draw();

		line.setLength(3);
		System.out.println("line length: " + line.getLength());
		line.draw();
		
		

	}

}
