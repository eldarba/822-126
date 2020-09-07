package system.core.exceptions;

public class WithdrawException extends Exception {

	private int clientId;
	private float currentBalance;
	private float withdrawAmount;

	public WithdrawException(String msg, int clientId, float currentBalance, float withdrawAmount) {
		super(msg);
		this.clientId = clientId;
		this.currentBalance = currentBalance;
		this.withdrawAmount = withdrawAmount;
	}

	public int getClientId() {
		return clientId;
	}

	public float getCurrentBalance() {
		return currentBalance;
	}

	public float getWithdrawAmount() {
		return withdrawAmount;
	}

}
