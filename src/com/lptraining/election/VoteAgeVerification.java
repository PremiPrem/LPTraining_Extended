package com.lptraining.election;

import com.lptraining.exception.AccessDeniedException;


public class VoteAgeVerification  {
	
	public void checkAge(int age)throws AccessDeniedException{
	if(age < 18) 
		throw new AccessDeniedException("Cannot perform Voting at "+ age);
		
	
	
	}
			
		}
		



		
	


