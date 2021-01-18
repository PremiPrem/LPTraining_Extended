package com.lptraining.election;

import com.lptraining.exception.InvalidProcessException;
import com.lptraining.exception.UserNotFoundException;


public class Voter extends ElectionOfficer {
	
	
	private String voterName;

	

	public String calculatedVote(int voterId) throws InvalidProcessException {
	      try { 
			VoterPermission voteCheck =  new VoterPermission();
			voteCheck.calculateVoterCount((String) voterName);
		
              }
	      
	      catch(UserNotFoundException e) {
	    	  
	    	  throw new InvalidProcessException( "You can't use same ID twice");
	      
	      }
	      return voterName;
	      }
}
	


