package c;

public class App {

	public static void main(String[] args) {

		Shape shape = new Shape("Red");
		System.out.println(shape.getArea());
		
		Rectangle rectangle = new Rectangle("Blue", 5, 3);
		System.out.println(rectangle.getArea());
		
		Circle circle = new Circle("Yellow", 3);
		System.out.println(circle.getArea());

	}

}
