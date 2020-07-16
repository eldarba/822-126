package b;

public class Point {

	// attributes
	int x;
	int y;

	// methods
	void moveUp() {
		y++;
	}

	void moveDown() {
		y--;
	}

	void moveRight() {
		x++;
	}

	void moveLeft() {
		x--;
	}

	// (3, 6)
	void print() {
		System.out.print("(");
		System.out.print(x);
		System.out.print(", ");
		System.out.print(y);
		System.out.println(")");
	}
}
