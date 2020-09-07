package system.core;

/**
 * a Log object represents a single client action such as deposit, withdraw etc.
 */
public class Log {

	// attributes
	private long timestamp;
	private int clientId;
	private String description;
	private float amount;

	// CTOR
	public Log(long timestamp, int clientId, String description, float amount) {
		super();
		this.timestamp = timestamp;
		this.clientId = clientId;
		this.description = description;
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Log [timestamp=" + timestamp + ", clientId=" + clientId + ", description=" + description + ", amount="
				+ amount + "]";
	}

	public static void main(String[] args) {
		Log log = new Log(System.currentTimeMillis(), 101, "testing", 150);
		System.out.println(log);
	}

}
