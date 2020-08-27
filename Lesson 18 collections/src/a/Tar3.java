package a;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Tar3 {

	public static void main(String[] args) {

		{
			List<String> names = new ArrayList<String>();
			names.add("Danna");
			names.add("Ran");
			names.add("David");

			System.out.println(names.get(1));
		}

		// ====================

		{
			System.out.println("===================");
			Set<String> names = new HashSet<String>();
			names.add("Danna");
			names.add("Adva");
			names.add("Ran");
			names.add("David");
			names.add("Avi");

			Iterator<String> it = names.iterator();
			while (it.hasNext()) {
				// do not call next more than once in each iteration
				String curr = it.next();
				System.out.println(curr);
				if (curr.charAt(0) == 'A') {
					it.remove();
				}
			}

			System.out.println(names);

			// System.out.println(names.get(1));
		}
	}

}
