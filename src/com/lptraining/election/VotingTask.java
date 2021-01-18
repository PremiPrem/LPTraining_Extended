package com.lptraining.election;

import com.lptraining.exception.IllegalVotingException;

public class VotingTask extends Election {
	public VotingTask()  {
		
	}
	
	public Voter verify(String vId) throws IllegalVotingException{
		if(vId.equals("5643T")) {
			return new Voter();
		} else{
			throw new IllegalVotingException("Already voted for " +  vId );
		}

}

}
