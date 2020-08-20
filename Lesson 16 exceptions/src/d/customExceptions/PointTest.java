package d.customExceptions;

import z.types.points.Point;

public class PointTest {

	public static void main(String[] args) {

		Point p1 = new Point();
		System.out.println(p1);

		try {
			p1.setX(5);
			p1.setY(300);
		} catch (IllegalXYException e) {
			e.printStackTrace();
		}
		System.out.println(p1);
	}

}
