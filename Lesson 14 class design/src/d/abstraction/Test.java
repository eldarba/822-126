package d.abstraction;

public class Test {

	public static void main(String[] args) {

		Shape s;
//		s = new Shape(); // cannot create an object from an abstract class

		s = new Rectangle(5, 3, "RED");
		System.out.println(s.getArea());
		System.out.println(s.getColor());

		s = new Circle("Yellow", 2.3);
		System.out.println(s.getArea());
		System.out.println(s.getColor());
	}

}
