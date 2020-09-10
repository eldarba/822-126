package a;

import java.io.IOException;

public class Demo2ReadWrite {

	public static void main(String[] args) {

		try {

			int b = System.in.read(); // read
			System.out.write(b); // write

			while (System.in.available() > 0) {
				// read and then write
				System.out.write(System.in.read());
			}

			System.out.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
