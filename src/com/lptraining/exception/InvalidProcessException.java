package com.lptraining.exception;

public class InvalidProcessException extends VotingPermissionDeniedException{
	/**
	 * 
	 */
	public InvalidProcessException(String message){
		super(message);
	 }
    public InvalidProcessException(String message, Exception cause) {
        super(message,cause);
    }


}
