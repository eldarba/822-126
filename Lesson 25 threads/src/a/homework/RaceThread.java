package a.homework;

public class RaceThread extends Thread {

	private RaceThread other;
	private Object key; // mutex - mutually exclusive Object

	public RaceThread(String name, Object key) {
		super(name);
		this.key = key;
	}

	public void setOther(RaceThread other) {
		this.other = other;
	}

	@Override
	public void run() {

		for (int i = 0; i <= 1000; i++) {
			System.out.println(i + " - " + getName());
		}

		// finish line
		synchronized (key) {
			other.interrupt();
//			if (other.getState() == Thread.State.TERMINATED) {
			if (isInterrupted()) {
				System.out.println(getName() + " LOST");
			} else {
				System.out.println(getName() + " WON");
			}
		}

	}

}
