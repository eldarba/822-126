package c.fileStreams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo3 {

	public static void main(String[] args) {

		// append will determine if we add to the file (append) or delete and write new
		// data
		boolean append = true;
		// try with resource - ARM - Auto Resource Management
		// java will close the resource for us
		try (

				BufferedReader in = new BufferedReader(new FileReader("files/file1.txt"));

				BufferedWriter out = new BufferedWriter(new FileWriter("files/file2.txt", append));

		) {

			// read a line of text from file to String
			String line = in.readLine(); // read the first line

			while (line != null) {
				System.out.println(line); // print the current line
				out.write(line); // write the current line to file
				out.newLine(); // write a line terminator
				line = in.readLine(); // read the next line from file
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
