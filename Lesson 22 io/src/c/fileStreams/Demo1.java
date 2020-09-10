package c.fileStreams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Demo1 {

	public static void main(String[] args) {

		BufferedReader in = null;

		try {
			// FileReader reader = new FileReader("files/file1.txt");
			// BufferedReader bufferedReader = new BufferedReader(reader);

			// create a character input stream decorated with buffer
			in = new BufferedReader(new FileReader("files/file1.txt"));
			String line = in.readLine();

			while (line != null) {
				System.out.println(line);
				line = in.readLine();
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// close the stream
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
