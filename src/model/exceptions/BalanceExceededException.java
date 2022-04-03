package model.exceptions;

public class BalanceExceededException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public BalanceExceededException(String message) {
		super(message);
	}
}
