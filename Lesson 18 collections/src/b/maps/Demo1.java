package b.maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.swing.JOptionPane;

public class Demo1 {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();

		map.put("Java", "a programming language");
		map.put("Table", "a furniture");
		map.put("Chair", "a furniture");
		map.put("Dog", "a barking animal");
		map.put("Red", "a bright color");
		// putting an existing key will overwrite the old one
		map.put("Table", "a wooden furniture");

		System.out.println(map);

		String word = "Java";
		word = JOptionPane.showInputDialog("enter a word");

		System.out.println(word + ": " + map.get(word));

		System.out.println("=============");
		System.out.println("All Keys:");
		// getting all keys:
		System.out.println(map.keySet());

		System.out.println("=============");
		System.out.println("All Values:");
		// getting all values:
		System.out.println(map.values());

		// =============================

		System.out.println("============== Print All");
		Set<String> setOfKeys = map.keySet();
		Iterator<String> it = setOfKeys.iterator();
		while (it.hasNext()) {
			String theKey = it.next();
			System.out.println(theKey + " = " + map.get(theKey));
		}

	}
}
