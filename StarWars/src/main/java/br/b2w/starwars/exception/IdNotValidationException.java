package br.b2w.starwars.exception;

public class IdNotValidationException extends RuntimeException {

	private static final long serialVersionUID = 3151424904813885715L;

	public IdNotValidationException(String message) {
		super(message);
	}
}