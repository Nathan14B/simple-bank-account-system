package model.exceptions;

public class NonPositiveAmountException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public NonPositiveAmountException(String message) {
		super(message);
	}
}
