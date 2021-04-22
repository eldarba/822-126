package p05.decorator;

public class CaramelDecorator extends BevarageDecorator {

	private double addedCost = 2;
	public String addedDescription = " + caramel";

	public CaramelDecorator(Beverage beverage) {
		super(beverage);
	}

	@Override
	public double getCost() {
		return this.beverage.getCost() + this.addedCost;
	}

	@Override
	public String getDescription() {
		return this.beverage.getDescription() + this.addedDescription;
	}

}
