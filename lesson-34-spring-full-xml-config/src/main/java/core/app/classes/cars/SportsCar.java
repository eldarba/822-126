package core.app.classes.cars;

public class SportsCar implements Car {
	
private Horn horn;

public SportsCar() {
}
	
	public SportsCar(Horn horn) {
		super();
		this.horn = horn;
	}

	@Override
	public String startDriving() {
		return "driving like a SportsCar";
	}

	@Override
	public String startHonk() {
		return horn.honk();
	}

	public Horn getHorn() {
		return horn;
	}

	public void setHorn(Horn horn) {
		this.horn = horn;
	}
	
	

}
