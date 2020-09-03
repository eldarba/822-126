package system.core;

public class Client {

	private int id;
	private String name;
	private float balance;
	private Account[] accounts = new Account[5];
	private float commissionRate;
	private float interestRate;
	private Logger logger;

	public Client(int id, String name, float balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
		logger = new Logger(null);
	}

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
				logTheOperation("account added to client", account.getBalance());
				return;
			}
		}
		System.out.println("account not added - you have " + accounts.length + " accounts");
	}

	/*
	 * getAccount(int index) : Account – returns the account of the specified index
	 * or null if does not exist
	 */
	public Account getAccount(int index) {
		if (index >= 0 && index < accounts.length) {
			return accounts[index];
		}
		return null;
	}

	/*
	 * remove account (int id) : void - remove the account with the same id from the
	 * array (by assigning a 'null' value to the array[position]) & transfers the
	 * money to the clients balance. Log the operation via creating Log object with
	 * appropriate data and sending it to the Logger.log(..) method.
	 */
	public void removeAccount(int accountId) {

		for (int i = 0; i < accounts.length; i++) {
			Account curr = accounts[i];
			if (curr.getId() == accountId) {
				accounts[i] = null; // remove from the array
				this.balance += curr.getBalance(); // transfers the money to the clients balance
				logTheOperation("removeAccount from client", curr.getBalance());
				return; // exit the loop - exit the method
			}
		}
		System.out.println("account with id " + accountId + " not found");
	}

	/*
	 * deposit(float) : void - implement to add the amount to client's balance
	 * according to the commission (which is now zero). Use the commission data
	 * member in your calculation). log the operation
	 */
	public void deposit(float amount) {
		this.balance += amount;
		float commission = amount * this.commissionRate;
		this.balance -= commission;
		logTheOperation("deposit", amount);
		logTheOperation("commission for deposit", commission);
	}

	/*
	 * withdraw(float) : void - implement to remove the amount from client's balance
	 * according to the commission (which is now zero). Use the commission data
	 * member in your calculation). log the operation
	 */
	public void withdraw(float amount) {
		this.balance -= amount;
		float commission = amount * this.commissionRate;
		this.balance -= commission;
		logTheOperation("deposit", amount);
		logTheOperation("commission for withdraw", commission);
	}

	/*
	 * autoUpdateAccounts() : void – run over the accounts, calculate the amount to
	 * add according to the client interest (meanwhile it is zero) and add it to
	 * each account balance. Use the interest data member in your calculation. Log
	 * this operation.
	 */
	public void autoUpdateAccounts() {
		for (Account account : accounts) {
			if (account != null) {
				// calculate the interest
				float interest = account.getBalance() * this.interestRate;
				// add the interest to the acount's balance
				account.setBalance(account.getBalance() + interest);
				// log the operation
				logTheOperation("autoUpdateAccount id " + account.getId(), interest);
			}
		}
	}

	/*
	 * getFortune() : float – returns the sum of client balance + total account
	 * balance.
	 */
	public float getFortune() {
		float fortune = this.balance;
		for (Account account : accounts) {
			if (account != null) {
				fortune += account.getBalance();
			}
		}
		return fortune;
	}

	/**
	 * log the operation - create a log and send to the logger
	 * 
	 * @param description description of the action
	 * @param amount      the amount of the operation
	 */
	private void logTheOperation(String description, float amount) {
		long timestamp = System.currentTimeMillis();
		int clientId = this.id;
		Log log = new Log(timestamp, clientId, description, amount);
		logger.log(log);
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

	@Override
	public String toString() {
		return "Client [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}

}
