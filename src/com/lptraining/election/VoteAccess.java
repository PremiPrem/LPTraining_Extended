package com.lptraining.election;

import com.lptraining.exception.AccessDeniedException;


public class VoteAccess {
	
	public VoteAccess() {
		
	}
	
		
		public Voter access(int age) throws AccessDeniedException{
			if(age > 18) 
			{
				return new Voter();
			} else {
				
				throw new AccessDeniedException("Cannot perform Voting at " + age);
			}
			
		}
		

}

		
	


