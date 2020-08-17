package a;

public class Test {

	public static void main(String[] args) {

		Animal[] animals = new Animal[10];
		animals[0] = new Dog();
		animals[1] = new Ant();
		animals[2] = new Bat();
		animals[3] = new Dog();
		animals[4] = new Dog();
		animals[5] = new Sparrow();
		animals[6] = new Butterfly();
		animals[7] = new Bat();
		animals[8] = new Ostrich();
		animals[9] = new Dog();

		for (int i = 0; i < animals.length; i++) {
			// add reference to current animal
			Animal currAnimal = animals[i];
			currAnimal.speak();

			// is it an advanced flyer
			if (currAnimal instanceof AdvancedFlyer) {
				// switch reference (remote control)
				AdvancedFlyer af = (AdvancedFlyer) currAnimal;
				af.takeOff();
				af.fly();
				af.land();
				af.navigate();
			} else {
				if (currAnimal instanceof Flyer) {
					Flyer f = (Flyer) currAnimal;
					f.fly();
				}

				if (currAnimal instanceof Navigator) {
					Navigator n = (Navigator) currAnimal;
					n.navigate();
				}
			}

			System.out.println("===========");
		}

	}

}
