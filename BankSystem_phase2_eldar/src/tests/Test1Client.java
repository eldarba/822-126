package tests;

import system.core.Account;
import system.core.Client;

public class Test1Client {

	public static void main(String[] args) {
		Client client = new Client(101, "Dov", 24000);
		Account ac1 = new Account(111, 100000);
		Account ac2 = new Account(222, 30000);
		Account ac3 = new Account(333, 100000);
		Account ac4 = new Account(444, 2500);
		Account ac5 = new Account(555, 100000);
		Account ac6 = new Account(666, 100000);

		client.addAccount(ac1);
		client.addAccount(ac2);
		client.addAccount(ac3);
		client.addAccount(ac4);
		client.addAccount(ac5);
		client.addAccount(ac6);

		System.out.println(client.getBalance()); // over va shav
		System.out.println(client.getAccounts()[0].getBalance()); // pikadon

		// add account test
		Client c = new Client(1, "aaa", 1500);
		c.addAccount(new Account(101, 20_000));
		c.addAccount(new Account(102, 50_000));

		System.out.println(c.getAccount(1000));
		System.out.println(c.getAccount(1));

	}

}
