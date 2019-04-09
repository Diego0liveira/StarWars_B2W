package br.b2w.starwars.exception;

public class NotExistException extends RuntimeException {

	private static final long serialVersionUID = -5161879315739469517L;

	public NotExistException(String message) {
		super(message);
	}
}