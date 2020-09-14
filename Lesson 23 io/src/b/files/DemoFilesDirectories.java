package b.files;

import java.io.File;
import java.io.IOException;

public class DemoFilesDirectories {

	public static void main(String[] args) {

		File f2 = new File("files/bbb.aaa");
		File f1 = new File(f2, "aaa.bbb");

		try {
			f2.mkdirs();
			f1.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("done");

	}

}
