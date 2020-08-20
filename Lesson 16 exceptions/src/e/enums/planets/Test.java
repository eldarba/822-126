package e.enums.planets;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		System.out.println(Planet.JUPITER);

		Planet[] planets = Planet.values();
		System.out.println(Arrays.toString(planets));

		Scanner sc = new Scanner(System.in);
		System.out.println("enter planet " + Arrays.toString(Planet.values()));
		String input = sc.nextLine();
		sc.close();
		// convert from String to enum type using the valueOf method
		Planet p = Planet.valueOf(input);
		System.out.println(p);
		System.out.println("mass: " + p.mass);
		System.out.println("orbit: " + p.getOrbit());

	}

}
