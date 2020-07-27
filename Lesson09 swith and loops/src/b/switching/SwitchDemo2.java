package b.switching;

public class SwitchDemo2 {

	public static void main(String[] args) {

		// switch with 3 modes: ON, OFF, STAND_BY

		// 1 - 3
		int mode = (int) (Math.random() * 3) + 1;
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
		}

	}

}
