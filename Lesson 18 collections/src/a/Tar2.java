package a;

import java.util.HashSet;
import java.util.Set;

public class Tar2 {

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<>();

		while (set.size() < 10) {
			int r = (int) (Math.random() * 10);
			set.add(r);
		}

		System.out.println(set);
		System.out.println("size: " + set.size());

	}

}
