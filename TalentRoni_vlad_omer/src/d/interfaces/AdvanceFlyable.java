package d.interfaces;

public interface AdvanceFlyable extends Flyable, Navigator {

	void takeoff();

	default void land() {
		System.out.println("land");
	}

}
