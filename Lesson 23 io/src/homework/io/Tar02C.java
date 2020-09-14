package homework.io;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Tar02C {

	public static void main(String[] args) {

		File file3 = new File("files/numbers.txt");

		try (PrintWriter out = new PrintWriter(file3);) {

			List<Integer> list = new ArrayList<Integer>();
			for (int i = 0; i < 10; i++) {
				int r = (int) (Math.random() * 6) + 10;
				list.add(r);
			}
			System.out.println(list);
			// get rid of duplicates
			Set<Integer> set = new LinkedHashSet<Integer>(list);
			System.out.println(set); // print the set to screen
			out.println(set); // print the set to file
			System.out.println("=============");
			System.out.println("number written to " + file3);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
