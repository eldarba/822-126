package homework.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Tar03B {

	public static void main(String[] args) {

		File file1 = new File("files/fromUser2.txt");

		try (

				BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

				PrintWriter out = new PrintWriter(new FileWriter(file1, true));

		) {

			System.out.println("enter lines. enter 'exit' to quit");
			String line = in.readLine(); // read first line

			while (!line.equalsIgnoreCase("exit")) {
				System.out.println(line);
				out.println(line);
				line = in.readLine();
			}

			System.out.println("== END ==");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
