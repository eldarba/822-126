package d.loops.forDemo;

public class Demo1For {

	public static void main(String[] args) {

		int x = (int) (Math.random() * 101);
		System.out.println("x: " + x);

		for (int i = 1; i <= x; i++) {
			System.out.print(i + ", ");
		}

		// צרו שני מספרים אקראיים והדפיסו את כל המספרים שביניהם מהקטן לגדול

	}

}
