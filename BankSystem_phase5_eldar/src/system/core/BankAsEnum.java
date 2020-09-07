package system.core;

public enum BankAsEnum {

	INSTANCE; // this is the singleton

	private Client[] clients;
	private Object accountUpdater;
	private float balance; // bank money from clients commissions

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
		System.out.println("client not added - you have " + clients.length + " clients");
	}

	/**
	 * removeClient(int id) : void - remove the client with the same id from the
	 * array (by assigning a 'null' value to the array[position]). Log the operation
	 */
	public void removeClient(int clientId) {
		for (int i = 0; i < clients.length; i++) {
			Client curr = clients[i];
			if (curr != null && curr.getId() == clientId) {
				clients[i] = null; // remove the client
				logTheOperation("client removed from bank", curr.getFortune(), clientId);
				return;
			}
		}
		System.out.println("client with id " + clientId + " not found");
	}

	/** get an array of all bank clients (without null elements) */
	public Client[] getClients() {
		Client[] temp = new Client[clients.length];
		int index = 0;
		// copy elements
		for (Client client : this.clients) {
			if (client != null) {
				temp[index++] = client;
			}
		}

		// create a temp array of the right length
		Client[] theClients = new Client[index];
		// copy element to the temp array
		System.arraycopy(temp, 0, theClients, 0, index);
		return theClients;
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

}
