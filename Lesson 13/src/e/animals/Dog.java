package e.animals;

public class Dog extends Mammal {
	
	@Override
	public void speak() {
		System.out.println("woof");
	}
	
	public void bite() {
		System.out.println("bite like a dog");
	}

}
