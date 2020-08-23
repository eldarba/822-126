package d.customExceptions;

public class IllegalXYException extends Exception {

	public IllegalXYException() {
		super();
	}

	public IllegalXYException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public IllegalXYException(String message, Throwable cause) {
		super(message, cause);
	}

	public IllegalXYException(String message) {
		super(message);
	}

	public IllegalXYException(Throwable cause) {
		super(cause);
	}

}
