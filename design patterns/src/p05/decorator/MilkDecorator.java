package p05.decorator;

public class MilkDecorator extends BevarageDecorator {

	private double addedCost = 3.5;
	public String addedDescription = " + milk";

	public MilkDecorator(Beverage beverage) {
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
