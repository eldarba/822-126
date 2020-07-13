package b;

import java.util.Scanner;

public class Tar2 {
	
	// יש לקלוט שני מספרים ולהציג את סכומם
	public static void main(String[] args) {
		// create a scanner connected to the input queue
		Scanner sc = new Scanner(System.in); // מקלדת
		// get the 2 numbers
		System.out.println("enter a number");
		int x = sc.nextInt();
		System.out.println("enter a number");
		int y = sc.nextInt();
		// calculate sum
		int sum = x + y;
		// print the result
		System.out.println(sum);
		sc.close();
	}

}
