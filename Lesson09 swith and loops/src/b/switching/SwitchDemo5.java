package b.switching;

public class SwitchDemo5 {

	public static void main(String[] args) {

		int grade = (int) (Math.random() * 11);
//		grade = -5;
		System.out.println(grade);

		switch (grade) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Fail");
			break;
		case 6:
		case 7:
			System.out.println("Sababa");
			break;
		case 8:
		case 9:
		case 10:
			System.out.println("Very Good");
			break;
		default:
			System.out.println(grade + " is not a valid grade value");
			break;
		}

	}

}
