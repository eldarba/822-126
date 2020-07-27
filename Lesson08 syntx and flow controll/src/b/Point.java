package b;

// class definition
public class Point {
	// attributes
	int x; // global
	int y;
	
	// mehods
	public void printX() {
		int x = 100; // local
		System.out.println(x); // print the local x variable
		System.out.println(this.x);  // print the global x variable
		// the "this" reference is a reference to the current object
		// the object that called the method
	}
	
	// test program
	public static void main(String[] args) {
		Point p1 = new Point();
		p1.x = 250;
		p1.printX();
	}

}
