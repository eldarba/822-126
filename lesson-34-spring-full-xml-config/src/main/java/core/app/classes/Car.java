package core.app.classes;

public class Car {
	
	private int number;
	private Engine engine;
	
	public Car() {
	}

	public Car(int number, Engine engine) {
		super();
		this.number = number;
		this.engine = engine;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [number=" + number + ", engine=" + engine + "]";
	}
	
	

}
