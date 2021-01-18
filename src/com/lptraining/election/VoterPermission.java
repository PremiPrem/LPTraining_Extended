package com.lptraining.election;


import com.lptraining.exception.UserNotFoundException;
import com.lptraining.exception.VotingPermissionDeniedException;


public class VoterPermission extends Voter  {
	


protected int voterCount;
public int calculateVoterCount(String vote)throws UserNotFoundException{
	try{
		
        VoteAgeVerification v = new VoteAgeVerification();
		v.checkAge(15);
		if (vote.equals("123456789v")) {
			voterCount = 1;
		}

		
	}
	catch(VotingPermissionDeniedException e) {
	    
		throw new UserNotFoundException("NIC Verification Succeed" + e);
	}
	
	return voterCount;
	
     
}



}






