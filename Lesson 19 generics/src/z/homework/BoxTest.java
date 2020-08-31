package z.homework;

public class BoxTest {

	public static void main(String[] args) {

		Box<Integer> box1 = new Box<>(11);
		int x = box1.getContent();
		System.out.println(x);
		box1.setContent(22);
		x = box1.getContent();
		System.out.println(box1.getContent());

		System.out.println("==============");
		Box<Character> box2 = new Box<>('A');
		char c = box2.getContent();
		System.out.println(c);
		box2.setContent('B');
		c = box2.getContent();
		System.out.println(c);

		/*
		 * הפסקה עד 19:05
		 */
	}
}
