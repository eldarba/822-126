package b;

public class App2 {

	public static void main(String[] args) {
		
		Pixel p1 = new Pixel(10, 20, "Red");
		Pixel p2 = new Pixel(40, 50);
		
		
		System.out.println(p1.getX() + ", " + p1.getY() + ", " + p1.getColor());
		System.out.println(p2.getX() + ", " + p2.getY() + ", " + p2.getColor());
		
		System.out.println(p1);
		

	}

}
