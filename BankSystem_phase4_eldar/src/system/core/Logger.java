package system.core;

/**
 * an object that handle log objects by storing them in a long term storage
 * mechanism
 */
public class Logger {

	// attributes
	private String driverName;

	// ctor
	public Logger(String driverName) {
		super();
		this.driverName = driverName;
	}

	/** implement to print Log on screen */
	public static void log(Log log) {
		System.out.println(log);
	}

	/** not supported yet */
	public Log[] getLogs() {
		return null;
	}

}
