package homework.io;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;

public class Tar5B {

	public static void main(String[] args) {

		try (DataInputStream in = new DataInputStream(
				new BufferedInputStream(new FileInputStream("files/rectangle.dat")));) {

//			out.writeInt(r.getLength());
//			out.writeInt(r.getWidth());
//			out.writeUTF(r.getColor());
//			out.writeInt(r.getArea());
			System.out.println(in.readInt());
			System.out.println(in.readInt());
			System.out.println(in.readUTF());
			System.out.println(in.readInt());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
