package org.eldar.java;

public class Car {
	
	int speed; // global - initialized automatically

	void drive() {
		int x; // local - NOT initialized automatically
		System.out.println(this.speed);
		x = 10;// initialization
		System.out.println(x);
	}
}
