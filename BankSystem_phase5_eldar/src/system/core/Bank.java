package system.core;

import java.util.ArrayList;
import java.util.List;

public class Bank {

	private List<Client> clients;
//	private Logger logger;
	public Object accountUpdater;
	private float balance; // bank money from clients commissions

	public void addCommission(float commission) {
		this.balance += commission;
	}

	// The Singleton Design Pattern - only one bank in the system
	// ===========================================================
	// 1. singleton - the instance
	private static Bank instance = new Bank();

	// 2. singleton - the instance
	private Bank() {
		clients = new ArrayList<>();
//		logger = new Logger(null);
	}

	// 3. singleton - the getter
	public static Bank getInstance() {
		return instance;
	}
	// ===========================================================

	public float getBalance() {
		return balance;
	}

	/**
	 * this operation returns total clients fortune. This is calculated by summing
	 * the total clients fortune – you should use Client.getFortune() method of each
	 * client.
	 */
	public float getClientsFortune() {
		float clientsFortune = 0;
		for (Client client : clients) {
			if (client != null) {
				clientsFortune += client.getFortune();
			}
		}
		return clientsFortune;
	}

	/**
	 * addClient(Client) : void - add the client to the array and log the operation.
	 * You should seek the array and place the Client where the first null value is
	 * found.
	 */
	public void addClient(Client client) {
		clients.add(client);
		logTheOperation("client added to bank", client.getFortune(), client.getId());
	}

	public void removeClient(Client client) {
		// find the index of the client in the list
		int index = clients.indexOf(client);
		if (index != -1) {
			// if we are here we found the client to remove
			client = clients.get(index);
			// remove the client from the list
			clients.remove(client);
			// log the operation
			logTheOperation("client removed from bank", client.getFortune(), client.getId());
		} else {
			// if we are here we DID NOT found the client to remove
			System.out.println(client + " not found");
		}

	}

	/** get an array of all bank clients (without null elements) */
	public Client[] getClients() {
		return clients.toArray(new Client[clients.size()]);
	}

	/**
	 * log the operation - create a log and send to the logger
	 * 
	 * @param description description description of the action
	 * @param amount      the amount of the operation
	 * @param clientId
	 */
	private void logTheOperation(String description, float amount, int clientId) {
		long timestamp = System.currentTimeMillis();
		Log log = new Log(timestamp, clientId, description, amount);
		Logger.log(log);
	}

	public void viewLogs() {
		System.out.println("NOT SUPPORTED YET");
	}

	public void startAccountUpdater() {
		System.out.println("NOT SUPPORTED YET");
	}

	/** returns the specified client or null if not exist */
	public Client getClient(int clientId) {
		for (Client client : clients) {
			if (client != null && client.getId() == clientId) {
				return client;
			}
		}
		return null;
	}

	/**
	 * Add a new method – printClientList() : void that prints the client details
	 * using the new toString() implementation you'll create in the next part.
	 */
	public void printClientList() {
		System.out.println("\n==== Client List ====");
		for (Client client : clients) {
			if (client != null) {
				System.out.println(client);
			}
		}
		System.out.println("==== =========== ====\n");
	}

}
