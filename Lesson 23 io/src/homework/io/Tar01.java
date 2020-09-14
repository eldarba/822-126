package homework.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Tar01 {

	public static void main(String[] args) {

		// bridge streams from byte to text
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

		try {
			String line = in.readLine();
			out.write(line);
			out.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
