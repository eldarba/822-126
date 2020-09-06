package e.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo1 {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");

		Set<Integer> keys = map.keySet();
		System.out.println(keys.getClass());
		Collection<String> values = map.values();
		System.out.println(values.getClass());

		System.out.println(keys);
		System.out.println(values);
	}
}
