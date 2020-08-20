package f.targil;

public class Car {

	private Color color;
	private int speed;

	public static final int MAX_SPEED = 120;
	public static final int MIN_SPEED = 0;

	public enum Color {
		RED, GREEN, BLUE;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getSpeed() {
		return speed;
	}

	/**
	 * @param speed the new speed
	 * @throws HighSpeedException if an invalid speed is attempted
	 */
	public void setSpeed(int speed) throws HighSpeedException {
		if (speed >= MIN_SPEED && speed <= MAX_SPEED) {
			this.speed = speed;
		} else {
			throw new HighSpeedException(speed + " is too fast");
		}
	}

	@Override
	public String toString() {
		return "Car [color=" + color + ", speed=" + speed + "]";
	}

}
