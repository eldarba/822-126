package e.interfaces;

public class Bat extends Mammal implements Flyer, Navigator {

	@Override
	public void speak() {
		System.out.println("Speak like a bat");
	}

	@Override
	public void fly() {
		System.out.println("Fly like a bat");
	}

	@Override
	public void navigate() {
		System.out.println("Fly like a bat");

	}

}
