package e.interfaces;

// in interfaces we can have multiple inheritance
public interface AdvancedFlyer extends Flyer, Navigator {

	void takeOff();

	void land();

}
