package b;

public class App {

	public static void main(String[] args) {
		// create a point object
		Point point = new Point();
		// set value for x and y
		point.x = 3;
		point.y = 6;
		// print
		point.print();
		// move
		point.moveRight();
		// print
		point.print();
		// move
		point.moveRight();
		// print
		point.print();
		// move
		point.moveDown();
		// print
		point.print();

	}

}
