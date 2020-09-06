package c.inner;

public class State {
	String name;
	private int population;

	public State(String name) {
		super();
		this.name = name;
	}

	// inner class
	public class Citiezen {
		String name;

		public Citiezen(String name) {
			super();
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public String getStateName() {
			return State.this.name;
		}

	}

	// static nested class
	public static class Shop {

	}

}
