package z.types.points;

import d.customExceptions.IllegalXYException;

/**
 * represent a point with x, y coordinates in the range 0 - 100
 * 
 * any attempt to assign an x, y value out of range will result in a checked
 * exception
 */
public class Point {

	private int x;
	private int y;

	private static final int MAX = 100;
	private static final int MIN = 0;

	public Point() {
	}

	public Point(int x, int y) throws IllegalXYException {
		super();
		setX(x);
		setY(y);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) throws IllegalXYException {
		if (x >= MIN && x <= MAX) {
			this.x = x;
		} else {
			throw new IllegalXYException("illegal x value: " + x);
		}
	}

	public int getY() {
		return y;
	}

	public void setY(int y) throws IllegalXYException {
		if (y >= MIN && y <= MAX) {
			this.y = y;
		} else {
			throw new IllegalXYException("illegal y value: " + y);
		}
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

}
