package e.animals;

public class Test {
	
	
	
	public static void main(String[] args) {
		
		Cat cat = new Cat();
		Dog dog = new Dog();
		Owl owl = new Owl();
		Hawk hawk = new Hawk();
		
		operateAnimal(cat);
		operateAnimal(dog);
		operateAnimal(owl);
		operateAnimal(hawk);
	}
	
	public static void operateAnimal(Animal animal) {
		animal.speak();
		// what if the animal is a dog?
		
		
		if(animal instanceof Dog) {
			Dog dog = (Dog)animal;
			dog.bite();
		}
	}

}
