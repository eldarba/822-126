package a.targilim;

import java.util.Scanner;

public class BiggestOf3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("enter 1st number: ");
		int a = sc.nextInt();
		System.out.print("enter 2nd number: ");
		int b = sc.nextInt();
		System.out.print("enter 3rd number: ");
		int c = sc.nextInt();
		sc.close();

		System.out.println("the numbers are:");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		System.out.println("maximum is:");
		if (a > b) {
			if (a > c) {
				System.out.println(a);
			} else {
				System.out.println(c);
			}
		} else {
			if (b > c) {
				System.out.println(b);
			} else {
				System.out.println(c);
			}
		}

	}

}
