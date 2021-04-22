package p04.adapter;

public class Automobil {

	private int speed;
	private int km;
	private Location location;

	public enum Location {
		NORTH, SOUTH, EAST, WEST;
	}

	public void go(int distance, int speed, Location direction) {
		this.speed = speed;
		this.km += distance;
		this.location = direction;
	}

	@Override
	public String toString() {
		return "Automobil [speed=" + speed + ", km=" + km + ", location=" + location + "]";
	}

	public Location getLocation() {
		return location;
	}

}
