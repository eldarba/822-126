package app.core.exceptions;

public class ProductWebsiteException extends Exception {

	private static final long serialVersionUID = 1L;

	public ProductWebsiteException() {
		super();
	}

	public ProductWebsiteException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ProductWebsiteException(String message, Throwable cause) {
		super(message, cause);
	}

	public ProductWebsiteException(String message) {
		super(message);
	}

	public ProductWebsiteException(Throwable cause) {
		super(cause);
	}

}
