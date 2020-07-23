package b;

public class ReferenceDemo {

	public static void main(String[] args) {
		
		// x is a primitive variable
		int x = 5;
		
		// str is a reference of type String
		// references are handles to objects
		String str = new String("aaa");
		// reference is like remote control
		// object is like a machine
		System.out.println(str);
		System.out.println(str.length());
		str.length();
		str.charAt(0);
		
		Point pnt = new Point();
		pnt.x = 5;
		pnt.y = 3;
		
		System.out.println(pnt.x);
		System.out.println(pnt.y);
		

	}

}
