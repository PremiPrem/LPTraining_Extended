package com.lptraining.exception;

public class IllegalVotingException  extends VotingPermissionDeniedException {

	
	private static final long serialVersionUID = 1L;
	
	public IllegalVotingException(){		
		super();
		
	}
	public IllegalVotingException(String message){
		super(message);
	 }
    public IllegalVotingException(String message, Exception cause) {
        super(message, cause);
    }
}

