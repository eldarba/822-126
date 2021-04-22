package p04.adapter;

public class FamilyCar implements Car {

	private int speed;
	private int km;
	private String location;

	@Override
	public void drive(int speed, int distance, String direction) {
		this.speed = speed;
		this.km += distance;
		this.location = direction;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "FamilyCar [speed=" + speed + ", km=" + km + ", location=" + location + "]";
	}

}
