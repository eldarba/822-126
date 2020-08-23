package a;

public interface AdvancedFlyer extends Flyer, Navigator {

	int MAX_ALTITUDE = 300;

	void takeOff();

	void land();

//	default int sum(int a, int b) {
//		return a + b;
//	}

}
