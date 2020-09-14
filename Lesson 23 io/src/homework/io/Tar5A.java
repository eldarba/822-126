package homework.io;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class Tar5A {

	public static void main(String[] args) {

		Rectangle r = new Rectangle(5, 3, "Red");

		try (DataOutputStream out = new DataOutputStream(
				new BufferedOutputStream(new FileOutputStream("files/rectangle.dat")));) {

			out.writeInt(r.getLength());
			out.writeInt(r.getWidth());
			out.writeUTF(r.getColor());
			out.writeInt(r.getArea());

			System.out.println("data of " + r + " wrriten to file");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
