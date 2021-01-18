package com.lptraining.exception;

public class UserNotFoundException extends VotingPermissionDeniedException {

		
		private static final long serialVersionUID = 1L;
		
		public UserNotFoundException(){		
			super();
			
		}
		public UserNotFoundException(String message){
			super(message);
		 }
	    public UserNotFoundException(String message, Throwable cause) {
	        super(message, cause);
	    }
	

}
