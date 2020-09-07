package tests;

import java.util.HashSet;
import java.util.Set;

import system.core.Client;
import system.core.RegularClient;

public class TestEquals {

	public static void main(String[] args) {

		Client c1 = new RegularClient(101, "aaa", 1000);
		Client c2 = new RegularClient(101, "bbb", 3000);

		Set<Client> set = new HashSet<Client>();
		set.add(c1);
		System.out.println(set.contains(c2));

	}

}
