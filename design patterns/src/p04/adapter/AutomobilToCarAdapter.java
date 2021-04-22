package p04.adapter;

import p04.adapter.Automobil.Location;

// 1. implement the interface to which we want to adapt
public class AutomobilToCarAdapter implements Car {

	// 2. define fields from which we want to adapt
	private Automobil auto;

	// 3. add ctor
	public AutomobilToCarAdapter(Automobil auto) {
		super();
		this.auto = auto;
	}

	// this method applies to cars
	@Override
	public void drive(int speed, int distance, String direction) {
		Location location = null;

		try {
			location = Location.valueOf(direction);
		} catch (IllegalArgumentException e) {
			System.out.println(e);
			location = auto.getLocation();
		}

		// invoke go method the right way
		auto.go(distance, speed, location);

	}

	@Override
	public String toString() {
		return auto.toString();
	}

}
