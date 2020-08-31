package a.interfaces;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Demo2 {

	public static void main(String[] args) {

		// collection
		Collection<Object> collection;
		collection = new ArrayList<>();
		collection = new LinkedList<>();
		collection = new HashSet<>();
		collection = new LinkedHashSet<>();
		collection = new TreeSet<>();

		List<Object> list;
		list = new ArrayList<>();
		list = new LinkedList<>();

		Set<Object> set;
		set = new HashSet<>();
		set = new LinkedHashSet<>();
		set = new TreeSet<>();

		// maps
		Map<Object, Object> map;
		map = new HashMap<>();
		map = new LinkedHashMap<>();
		map = new TreeMap<>();

		// iterators
		Iterator<Object> iterator;
		iterator = list.iterator();
		iterator = set.iterator();

		ListIterator<Object> listIterator;
		listIterator = list.listIterator();

		// comparison interfaces (used for sorting)
		Comparable<Object> comparable; // natural order
		Comparator<Object> comparator; // other orders

	}

}
