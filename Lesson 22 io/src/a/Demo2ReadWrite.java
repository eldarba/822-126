package a;

import java.io.IOException;

public class Demo2ReadWrite {

	public static void main(String[] args) {

		try {

			int b = System.in.read();
			System.out.write(b);

			while (System.in.available() > 0) {
				System.out.write(System.in.read());
			}

			System.out.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
