package ie.gmit.dip;

public class CypherException extends Throwable {
	private static final long serialVersionUID = 777L;

	public CypherException() {
		super();
	}

	public CypherException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public CypherException(String message, Throwable cause) {
		super(message, cause);
	}

	public CypherException(String message) {
		super(message);
	}

	public CypherException(Throwable cause) {
		super(cause);
	}

}
