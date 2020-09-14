package homework.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Tar02B {

	public static void main(String[] args) {

		File fileSrc = new File("files/file1");
		File fileDst = new File("files/file2");

		try (

				BufferedReader in = new BufferedReader(new FileReader(fileSrc));

				PrintWriter out = new PrintWriter(fileDst);

		) {

			String line = in.readLine();// read first line
			int n = 1; // line number
			while (line != null) {
				System.out.println(line); // print line to screen
				out.println(n++ + ")" + line); // print line to file
				line = in.readLine(); // read the next line
			}

			System.out.println("=============");
			System.out.println("copied from");
			System.out.println(fileSrc);
			System.out.println("to");
			System.out.println(fileDst);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
