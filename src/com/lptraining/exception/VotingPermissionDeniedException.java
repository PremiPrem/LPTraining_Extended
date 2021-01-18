package com.lptraining.exception;

public class VotingPermissionDeniedException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public VotingPermissionDeniedException(){		
		super();
		
	}

	public VotingPermissionDeniedException(String message){
		super(message);
	 }
    public VotingPermissionDeniedException(String message, Exception cause) {
        super(message,cause);
    }

}
