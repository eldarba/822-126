package a;

import java.util.Scanner;

public class App2Input {

	public static void main(String[] args) {
		
		// input queue
		String str = "3 9 11 2 100";
		System.out.println(str);
		
		// scanner is a java object for input operations
		Scanner sc = new Scanner(str);
		int x = sc.nextInt(); // read first element from input queue
		System.out.println(x);
		
		x = sc.nextInt();
		System.out.println(x);

		x = sc.nextInt();
		System.out.println(x);
		
		x = sc.nextInt();
		System.out.println(x);
		
		x = sc.nextInt();
		System.out.println(x);

		x = sc.nextInt();
		System.out.println(x);
		
		
		
		sc.close();
		
		
	}

}
