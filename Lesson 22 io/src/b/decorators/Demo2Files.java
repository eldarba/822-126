package b.decorators;

import java.io.File;
import java.io.IOException;

public class Demo2Files {

	public static void main(String[] args) {

		try {
			File folder = new File("c:/eldar/temp");
			File file = new File(folder, "letter.txt");

			System.out.println(folder);
			System.out.println(file);

			folder.mkdirs(); // create folder
			file.createNewFile(); // create file

			System.out.println(folder.exists());
			System.out.println(file.exists());

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
