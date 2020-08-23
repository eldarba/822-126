package b;

/**
 * A Point instance as x, y location in the range 0 to 100 inclusive
 * 
 * @author Eldar
 *
 */
public class Point {

	// fields / attributes
	private int x;
	private int y;
	
	// A CTOR is a special method that runs only on object creation
	// CTOR usually initialize the object state
	// default CTOR
	public Point() {
		super(); // invoking another CTOR in the super class
		System.out.println(">>> CTOR");
	}
	
	public Point(int x, int y) {
		super(); // invoking another CTOR in the super class
		setX(x);
		setY(y);
		System.out.println(">>> CTOR(x, y)");
	}
	
	

	// methods
	/**
	 * Set the value for x according to the specified value.
	 * 
	 * @param val the specified value for x
	 */
	public void setX(int val) {
		if (val >= 0 && val <= 100) {
			x = val;
		}
	}

	public int getX() {
		return x;
	}

	public void setY(int y) {
		if (y >= 0 && y <= 100) {
			this.y = y; // overwrite the old value of this.y
		}
	}

	public int getY() {
		return y;
	}

}
