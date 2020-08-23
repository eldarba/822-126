package f.targil;

public class HighSpeedException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public HighSpeedException() {
		super();
	}

	public HighSpeedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public HighSpeedException(String message, Throwable cause) {
		super(message, cause);
	}

	public HighSpeedException(String message) {
		super(message);
	}

	public HighSpeedException(Throwable cause) {
		super(cause);
	}

}
