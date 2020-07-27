package b.switching;

public class SwitchDemo1 {

	public static void main(String[] args) {

		// switch with 3 modes: ON, OFF, STAND_BY

		// 1 - 3
		int mode = (int) (Math.random() * 3) + 2;
		System.out.println(mode);

		if (mode == 1) {
			System.out.println("ON");
		} else if (mode == 2) {
			System.out.println("OFF");
		} else if (mode == 3) {
			System.out.println("STAND_BY");
		} else {
			System.out.println(mode + " is illegal");
		}

	}

}
