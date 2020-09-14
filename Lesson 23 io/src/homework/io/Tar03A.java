package homework.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tar03A {

	public static void main(String[] args) {

		try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in));) {
			System.out.println("enter lines. enter 'exit' to quit");
			String line = in.readLine();

			while (!line.equalsIgnoreCase("exit")) {
				System.out.println(line);
				line = in.readLine();
			}

			System.out.println("== END ==");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
