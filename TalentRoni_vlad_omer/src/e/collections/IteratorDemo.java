package e.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> set = new HashSet<Integer>();

		set.add(1);
		set.add(2);
		set.add(3);
		System.out.println(set);

		Iterator<Integer> it = set.iterator();

		while (it.hasNext()) {
			Integer curr = it.next();
			System.out.println(curr);
			if (curr % 2 == 0) {
				it.remove();
			}
		}

		System.out.println(set);
	}

}
