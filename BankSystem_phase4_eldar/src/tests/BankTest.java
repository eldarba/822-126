package tests;

import java.util.Arrays;

import system.core.Account;
import system.core.Bank;
import system.core.Client;
import system.core.GoldClient;
import system.core.PlatinumClient;
import system.core.RegularClient;
import system.core.exceptions.WithdrawException;

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
		Bank bank = Bank.getInstance();
//		BankAsEnum bankAsEnum = BankAsEnum.INSTANCE;
		// add 3 clients
		bank.addClient(new RegularClient(1, "aaa", 10_000));
//		bankAsEnum.addClient(new Client(1, "aaa", 10_000));
		bank.addClient(new GoldClient(2, "bbb", 15_000));
		bank.addClient(new PlatinumClient(3, "ccc", 7_000));

		System.out.println("========================");
		// deposit
		bank.getClient(1).deposit(100);
		// withdraw
		try {
			bank.getClient(2).withdraw(100000000);
		} catch (WithdrawException e) {
			System.out.println("error: ");
			System.out.println(e.getClientId());
			System.out.println("tried to withdraw:");
			System.out.println(e.getWithdrawAmount());
			System.out.println("but has only:");
			System.out.println(e.getCurrentBalance());
			System.out.println(e.getMessage());
		}
		System.out.println("========================");
		// add 2 accounts
		bank.getClient(2).addAccount(new Account(101, 150_000));
		bank.getClient(2).addAccount(new Account(102, 350_000));

		// print all bank clients
//		System.out.println(Arrays.toString(bank.getClients()));

		bank.printClientList();

		// remove client 2
		Client clientTormove = new RegularClient(2, null, 0);
		bank.removeClient(clientTormove);
		System.out.println(Arrays.toString(bank.getClients()));

	}

}
