package e.interfaces;

public class Owl extends Bird implements AdvancedFlyer {

	@Override
	public void fly() {
		System.out.println("fly like an owl");

	}

	@Override
	public void navigate() {
		System.out.println("navigate like an owl");

	}

	@Override
	public void takeOff() {
		System.out.println("takeOff like an owl");

	}

	@Override
	public void land() {
		System.out.println("land like an owl");

	}

	@Override
	public void speak() {
		System.out.println("speak like an owl");

	}

}
