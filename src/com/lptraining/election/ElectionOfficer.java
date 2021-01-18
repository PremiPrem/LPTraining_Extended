package com.lptraining.election;



import com.lptraining.exception.InvalidProcessException;
import com.lptraining.exception.VotingPermissionDeniedException;


public class ElectionOfficer extends Election {
	protected int voterCount;
	public int calculateVoterCount(int voterId,String NIC,int age)throws VotingPermissionDeniedException{
		try{
			
	        Voter voter = new Voter();
			voter.calculatedVote(4);
			if (voterId==12345) {
				voterCount = 1;
			}

			
		}
		catch(InvalidProcessException e) {
		    
			throw new VotingPermissionDeniedException("Voting can't perform.This ID already performed voting" , e);
		}
		
		return voterCount;
		
	     
	}

}

