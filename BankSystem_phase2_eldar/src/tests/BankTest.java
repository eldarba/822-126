package tests;

import java.util.Arrays;

import system.core.Account;
import system.core.Bank;
import system.core.Client;

public class BankTest {

	public static void main(String[] args) {
		/*
		 * 1. create a bank
		 * 
		 * 2. add 3 clients
		 * 
		 * 3. deposit 100 to client 1
		 * 
		 * 4. withdraw 100 from client 2
		 * 
		 * 5. add 2 accounts to client 2
		 * 
		 * 6. remove client 2
		 */

		// create a bank
		Bank bank = new Bank();
		// add 3 clients
		bank.addClient(new Client(1, "aaa", 10_000));
		bank.addClient(new Client(2, "bbb", 15_000));
		bank.addClient(new Client(3, "ccc", 7_000));

		// deposit
		bank.getClient(1).deposit(100);
		// withdraw
		bank.getClient(2).withdraw(100);
		// add 2 accounts
		bank.getClient(2).addAccount(new Account(101, 150_000));
		bank.getClient(2).addAccount(new Account(102, 350_000));

		// print all bank clients
		System.out.println(Arrays.toString(bank.getClients()));

		// remove client 2
		bank.removeClient(2);
		System.out.println(Arrays.toString(bank.getClients()));

	}

}
