package a;

import java.util.Scanner;

public class App3Input {

	public static void main(String[] args) {
		
		// input queue
		String str = "3 9 11 2 100";
		System.out.println(str);
		
		// scanner is a java object for input operations
		Scanner sc = new Scanner(str);
		System.out.println(sc.nextInt());
		System.out.println(sc.nextInt());
		System.out.println(sc.nextInt());
		System.out.println(sc.nextInt());
		System.out.println(sc.nextInt());
		
		
		
		sc.close();
		
		
	}

}
