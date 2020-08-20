package e.enums.planets;

public enum Planet {

	SATURN(8, 100), MARS(7, 900), EARTH(3, 900), JUPITER(12, 600);

	// attributes
	public final int mass; // weigth
	private int orbit; // distance from sun

	// CTOR
	private Planet(int mass, int orbit) {
		this.mass = mass;
		this.orbit = orbit;
	}

	// methods
	public int getMass() {
		return mass;
	}

	public int getOrbit() {
		return orbit;
	}

	public void setOrbit(int orbit) {
		this.orbit = orbit;
	}

}
