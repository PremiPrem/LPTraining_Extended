package com.lptraining.election;

import com.lptraining.exception.AccessDeniedException;
import com.lptraining.exception.IllegalVotingException;
import com.lptraining.exception.InvalidProcessException;
import com.lptraining.exception.UserNotFoundException;

public class Election {

	public static void main(String[] args) {
		
		
	
			VoterPermission voter= new VoterPermission();
			VoteAgeVerification voteAccess = new VoteAgeVerification();
			 VotingTask voting= new VotingTask();
			 Voter v= new Voter();
				try{
					voter.authenticate("123456789");
					voteAccess.access(15);
					voting.verify("6754E");
					 v.verify("6754E");
					 } catch(UserNotFoundException e) {
					System.err.println("Invalid NIC Number");
					e.printStackTrace();
					 } catch(AccessDeniedException e) {
					System.err.println("You must above 18 to vote");
					e.printStackTrace();
					 } catch(IllegalVotingException e) {
	            	   e.printStackTrace();
	                 } catch(InvalidProcessException e) {
	            	    System.err.println("This ID already performed voting"); 
	            	   e.printStackTrace();
	                                                       }
                                                    }
	
                                      }

			
		

	


