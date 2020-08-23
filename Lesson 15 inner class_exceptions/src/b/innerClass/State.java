package b.innerClass;

public class State {
	// state attributes
	private String name;
	private int population;
	private double area;
//	public Citizen[] citizens = new Citizen[100];

	// state CTOR
	public State(String name, double area) {
		super();
		this.name = name;
		this.area = area;
	}

	// state methods
	public String getName() {
		return name;
	}

	public double getArea() {
		return area;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public int getPopulation() {
		return population;
	}

	// Citizen class definition (INNER)
	public class Citizen {
		// citizen attribuites
		public final int id;
		private String name;
		private int age;

		// CTOR
		public Citizen(String name, int age) {
			super();
			this.name = name;
			this.age = age;
			State.this.population++;
			this.id = State.this.population;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public int getId() {
			return id;
		}

		public State getState() {
			return State.this;
		}

		public String getStateName() {
			return State.this.name;
		}

	}
}
