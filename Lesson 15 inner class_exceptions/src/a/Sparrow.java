package a;

public class Sparrow extends Bird implements Navigator, Flyer {

	@Override
	public void speak() {
		System.out.println("speak like a bird");

	}

	@Override
	public void fly() {
		System.out.println("fly like a bird");

	}

	@Override
	public void navigate() {
		System.out.println("navigate like a bird");

	}

}
