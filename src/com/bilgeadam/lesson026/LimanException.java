package com.bilgeadam.lesson026;

public class LimanException extends Exception {

	private String message;

	public LimanException(String message) {
		super(message);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
