package homework.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import javax.swing.JOptionPane;

public class Tar02CAppend {

	public static void main(String[] args) {

		File file3 = new File("files/numbers.txt");

		int input = JOptionPane.showConfirmDialog(null, "do you want to append?");
		System.out.println(input);
		boolean append = input == 0 ? true : false;
		try (PrintWriter out = new PrintWriter(new FileWriter(file3, append))) {

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
