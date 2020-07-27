package b.switching;

public class SwitchDemo3 {

	public static void main(String[] args) {

		// switch with 3 modes: ON, OFF, STAND_BY

		// 1 - 4
		int mode = (int) (Math.random() * 4) + 1;
		System.out.println(mode);

		switch (mode) {
		case 1:
			System.out.println("ON");
			break;
		case 2:
			System.out.println("OFF");
			break;
		case 3:
			System.out.println("STAND_BY");
			break;
		default:
			System.out.println(mode + " is illegal");
			break;
		}

	}

}
