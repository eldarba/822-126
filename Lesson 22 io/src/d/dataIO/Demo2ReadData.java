package d.dataIO;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo2ReadData {

	public static void main(String[] args) {

//		long x1 = 102;
//		byte x2 = 5;
//		boolean x3 = true;
//		int x4 = 500;

		File f1 = new File("files/data");
		File f2 = new File(f1, "file1");

		try (DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream(f2)));) {

			/*
			 * 
			 * */
			long x1 = in.readLong();
			byte x2 = in.readByte();
			boolean x3 = in.readBoolean();
			int x4 = in.readInt();

			System.out.println(x1);
			System.out.println(x2);
			System.out.println(x3);
			System.out.println(x4);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
