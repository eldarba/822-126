package f.shapes;

public class Test {

	public static void main(String[] args) {

		Shape[] shapes = new Shape[5];

		shapes[0] = new Rectangle(2, 2);
		shapes[1] = new Rectangle(3, 8);
		shapes[2] = new Shape();
		shapes[3] = new Rectangle(5, 10);
		shapes[4] = new Circle(2.5);

		for (int i = 0; i < shapes.length; i++) {
			Shape s = shapes[i]; // reference to current element
			if ((s.getClass() != Shape.class)) {
				System.out.println("area: " + s.getArea() + ": " + s.getClass().getSimpleName());
			} else {
				System.out.println("no area");
			}
		}

	}

}
