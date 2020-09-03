package system.core;

public class Bank {

	private Client[] clients;
	private Logger logger;
	private Object accountUpdater;
	private float balance; // bank money from clients commissions

	// CTOR
	public Bank() {
		clients = new Client[100];
		logger = new Logger(null);
	}

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

		for (int i = 0; i < clients.length; i++) {
			if (clients[i] == null) {
				clients[i] = client;
				logTheOperation("client added to bank", client.getFortune(), client.getId());
				return;
			}
		}
		System.out.println("client not added - you have 100 clients");
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
		logger.log(log);
	}

}
