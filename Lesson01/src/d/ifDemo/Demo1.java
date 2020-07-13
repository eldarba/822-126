package d.ifDemo;

public class Demo1 {

	public static void main(String[] args) {
		
		int x = 5;
		int y = 3;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(x > y);
		System.out.println(x < y);
		System.out.println(x == y);
		
		if(x > y) {
			// true block
			System.out.println("x is greater than y");
		}else {
			// false block
			System.out.println("x is NOT greater than y");
		}
	}
}
