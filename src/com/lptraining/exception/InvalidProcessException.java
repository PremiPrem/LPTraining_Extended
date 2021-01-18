package com.lptraining.exception;

public class InvalidProcessException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidProcessException(String message, Exception exception){
        super(message, exception);
    }


}
