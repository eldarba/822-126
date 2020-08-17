package b.innerClass;

import b.innerClass.State.Citizen;

public class Test {

	public static void main(String[] args) {

		State israel = new State("Israel", 150);
		State france = new State("France", 200);

		Citizen yaniv = israel.new Citizen("Yaniv", 18);
		Citizen ron = israel.new Citizen("Ron", 18);
		Citizen pier = france.new Citizen("Pier", 22);
		Citizen danna = israel.new Citizen("Danna", 25);

		System.out.println(yaniv.getName() + " from " + yaniv.getState().getName());
		System.out.println(pier.getName() + " from " + pier.getStateName());
		System.out.println(danna.getName() + " state population: " + danna.getState().getPopulation());
		System.out.println(ron.getName() + " id: " + ron.id);

	}

}
