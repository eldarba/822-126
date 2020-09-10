package c.fileStreams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Demo2 {

	public static void main(String[] args) {

		// try with resource - ARM - Auto Resource Management
		// java will close the resource for us
		try (BufferedReader in = new BufferedReader(new FileReader("files/file1.txt"));) {

			// read a line of text from file to String
			String line = in.readLine();

			while (line != null) {
				System.out.println(line);
				line = in.readLine();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
