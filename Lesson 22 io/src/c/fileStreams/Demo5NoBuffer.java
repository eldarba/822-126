package c.fileStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo5NoBuffer {

	public static void main(String[] args) {

		// try with resource - ARM - Auto Resource Management
		// java will close the resource for us
		try (

				FileInputStream in = new FileInputStream("files/puppy.jpg");

				FileOutputStream out = new FileOutputStream("files/puppyCopy.jpg");

		) {

			long ts1 = System.currentTimeMillis();

			int availableBytes = in.available();
			System.out.println("number of bytes to read: " + availableBytes);

			// read a byte from file
			int b = in.read(); // read the first byte

			while (b != -1) {
				System.out.println(b); // print the current byte
				out.write(b); // write the current byte to file
				b = in.read(); // read the next byte
			}

			long ts2 = System.currentTimeMillis();
			System.out.println("file copied in " + (ts2 - ts1) + "ms");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
