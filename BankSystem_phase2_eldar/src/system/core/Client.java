package system.core;

public class Client {

	private int id;
	private String name;
	private float balance;
	private Account[] accounts = new Account[5];
	private float commissionRate;
	private float interestRate;
	private Logger logger;

	/**
	 * add the account to the array
	 * 
	 * log the operation.
	 * 
	 * You should seek the array and place the Account where the first null value is
	 * found.
	 */
	public void addAccount(Account account) {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] == null) {
				accounts[i] = account;
				// log the operation - create a log and send to the logger
				long timestamp = System.currentTimeMillis();
				int clientId = this.id;
				String description = "account added to client";
				float amount = account.getBalance();
				Log log = new Log(timestamp, clientId, description, amount);
				logger.log(log);
				//
				return;
			}
		}
		System.out.println("account not added - you have 5 accounts");
	}

	public Client(int id, String name, float balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
		logger = new Logger(null);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public Account[] getAccounts() {
		return accounts;
	}

}
