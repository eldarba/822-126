package a;

import java.io.IOException;

public class Demo1ReadWrite {

	public static void main(String[] args) {
		try {

			// read 1 byte using standard input
			int myByte = System.in.read();
			System.out.println(myByte);

			// write the byte back to standard out
			System.out.write(myByte);
			System.out.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
