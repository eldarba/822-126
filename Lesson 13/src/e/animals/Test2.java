package e.animals;

public class Test2 {
	
	public static void main(String[] args) {
		
		Animal[] animals = new Animal[4];
		
		animals[0] = new Dog();
		animals[1] = new Cat();
		animals[2] = new Hawk();
		animals[3] = new Owl();
		
		for (int i = 0; i < animals.length; i++) {
			animals[i].speak();
			if(animals[i] instanceof Dog) {
				((Dog)animals[i]).bite();
			}
		}
	}

}
