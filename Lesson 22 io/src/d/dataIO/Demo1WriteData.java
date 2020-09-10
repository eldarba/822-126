package d.dataIO;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo1WriteData {

	public static void main(String[] args) {

		long x1 = 102;
		byte x2 = 5;
		boolean x3 = true;
		int x4 = 500;

		File f1 = new File("files/data");
		File f2 = new File(f1, "file1");
		f1.mkdir();
		try {
			f2.createNewFile();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		try (DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(f2)));) {
			out.writeLong(x1);
			out.writeByte(x2);
			out.writeBoolean(x3);
			out.writeInt(x4);
			System.out.println("data written to " + f2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
