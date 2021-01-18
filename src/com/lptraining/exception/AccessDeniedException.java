package com.lptraining.exception;

public class AccessDeniedException extends VotingPermissionDeniedException {

	
		private static final long serialVersionUID = 1L;
		
		public AccessDeniedException(){		
			super();
			
		}
		public AccessDeniedException(String message){
			super(message);
		 }
	    public AccessDeniedException(String message, Exception cause) {
	        super(message, cause);
	    }

	}


