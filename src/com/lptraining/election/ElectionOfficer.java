package com.lptraining.election;


import com.lptraining.exception.IllegalVotingException;
import com.lptraining.exception.InvalidProcessException;


public class ElectionOfficer extends Election {
	protected int voterCount;
	public int calculateVoterCount(int voterId,String NIC,int age)throws IllegalVotingException{
		try{
			
	        Voter voter = new Voter();
			voter.calculatedVote(4);
			if (voterId==12345) {
				voterCount = 1;
			}

			
		}
		catch(InvalidProcessException e) {
		    
			throw new IllegalVotingException("Voting can't perform.This ID already performed voting" + e);
		}
		
		return voterCount;
		
	     
	}

}

