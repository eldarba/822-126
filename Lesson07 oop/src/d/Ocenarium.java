package d;

public class Ocenarium {

	int waterLevel;

	void addWater(int liters) { // method definition contains parameters
		waterLevel += liters;
	}

	void addWater() {
		waterLevel++;
	}

	public static void main(String[] args) {
		Ocenarium oc = new Ocenarium();
		System.out.println(oc.waterLevel);

		oc.addWater(25); // method invocation contains arguments (25)
		System.out.println(oc.waterLevel);

		oc.addWater(10);
		System.out.println(oc.waterLevel);

		oc.addWater();
		System.out.println(oc.waterLevel);
	}

}
