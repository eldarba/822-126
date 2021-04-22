package p05.decorator;

public abstract class BevarageDecorator extends Beverage {

	protected Beverage beverage;

	public BevarageDecorator(Beverage beverage) {
		super();
		this.beverage = beverage;
	}

}
