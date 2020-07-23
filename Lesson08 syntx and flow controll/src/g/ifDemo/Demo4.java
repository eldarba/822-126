package g.ifDemo;

public class Demo4 {

	public static void main(String[] args) {

		int a = 0;
		int b = 100;
		int grade = (int) (Math.random() * (b - a + 1)) + a;
		System.out.println(grade);
		System.out.println("================");

		if (grade < 60) {
			System.out.println("Fail");
		} else if (grade < 70) {
			System.out.println("pass");
		} else if (grade < 80) {
			System.out.println("good");
		} else {
			System.out.println("very good");
		}
		

	}

}
