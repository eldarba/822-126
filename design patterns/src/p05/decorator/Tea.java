package p05.decorator;

public class Tea extends Beverage {

	@Override
	public double getCost() {
		return 7;
	}

	@Override
	public String getDescription() {
		return "tea";
	}

}
