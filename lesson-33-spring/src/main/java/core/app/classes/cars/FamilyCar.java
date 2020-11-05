package core.app.classes.cars;

public class FamilyCar implements Car {
	
	private Horn horn;
	private String color;
	
	public FamilyCar() {
	}
	
	public FamilyCar(Horn horn) {
		super();
		this.horn = horn;
	}

	@Override
	public String startDriving() {
		return "driving like a FamilyCar";
	}

	@Override
	public String startHonk() {
		return "the " + color + " car " + horn.honk();
	}

	public Horn getHorn() {
		return horn;
	}

	public void setHorn(Horn horn) {
		this.horn = horn;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	

}
