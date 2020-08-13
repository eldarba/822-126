package d.abstraction;

public class Test2 {

	public static void main(String[] args) {

		Shape[] shapes = new Shape[4];

		shapes[0] = new Circle("Red", 3.3);
		shapes[1] = new Rectangle(4, 7, "Blue");
		shapes[2] = new Circle("Black", 5);
		shapes[3] = new Rectangle(4.1, 7.3, "White");

		for (int i = 0; i < shapes.length; i++) {
			System.out.println(shapes[i]);
			System.out.println(shapes[i].getColor());
			System.out.println(shapes[i].getArea());
			System.out.println("===================");
		}

	}

}
