package com.lptraining.election;

import com.lptraining.exception.InvalidProcessException;

public class Voter {
	
	
	
	public Voter verify(String vId) throws InvalidProcessException{
		if(vId.equals("5643T")) {
			return new Voter();
		} else {
			throw new InvalidProcessException("Invalid Voting Process for  " + vId);
		}

}
	

}
