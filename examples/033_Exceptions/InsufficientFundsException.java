public class InsufficientFundsException extends Exception {

	public InsufficientFundsException() {
		super("InsufficientFundsException");
	}

	public InsufficientFundsException(String message) {
		super(message);
	}
}
