package com.lptraining.election;

import com.lptraining.exception.AccessDeniedException;
import com.lptraining.exception.IllegalVotingException;
import com.lptraining.exception.InvalidProcessException;
import com.lptraining.exception.UserNotFoundException;

public class Election {

	public static void main(String[] args) {
		
		
	
			VoterPermission voter= new VoterPermission();
				try{
					voter.authenticate("123456789");			
					
				} catch(UserNotFoundException e) {
					e.printStackTrace();
				}
				
				VoteAgeVerification voteAccess = new VoteAgeVerification();
				try{
					voteAccess.access(15);
					
				} catch(AccessDeniedException e) {
//					System.err.println(e);
					e.printStackTrace();
				}
				
			
	               VotingTask voting= new VotingTask();
	                     try{
		                   voting.verify("6754E");			
		
	               } catch(IllegalVotingException e) {
	            	   e.printStackTrace();
	                                                       }
	                     Voter v= new Voter();
	                     try{
		                   v.verify("6754E");			
		
	               } catch(InvalidProcessException e) {
	            	   e.printStackTrace();
	                                                       }
                                                    }
	
                                      }

			
		

	


