package g.ifDemo;

public class Demo1 {
	
	public static void main(String[] args) {
		
		double r = Math.random();
		
		System.out.println(r);
		System.out.println(r * 11);
		System.out.println((int)(r * 11));
		
		int r2 = (int)(Math.random()*11);
		System.out.println(r2);
		
		int x = 5;
		
		if(x < 10) {
			System.out.println("Big");
		}
		
	}

}
