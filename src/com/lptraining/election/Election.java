package com.lptraining.election;

import com.lptraining.exception.AccessDeniedException;
import com.lptraining.exception.IllegalVotingException;
import com.lptraining.exception.UserNotFoundException;

public class Election {

	public static void main(String[] args) {
	
			VoterPermission voter= new VoterPermission();
				try{
					voter.authenticate("123456789v");			
					
				} catch(UserNotFoundException e) {
					System.err.println(e);
				}
				
				VoteAccess voteAccess = new VoteAccess();
				try{
					voteAccess.access(15);
					
				} catch(AccessDeniedException e) {
					System.err.println(e);
				}
				
			
	               Voting voting= new Voting();
	                     try{
		                   voting.verify("6754E");			
		
	               } catch(IllegalVotingException e) {
		                   System.err.println(e);
	                                                       }
                                                    }
	
                                      }

			
		

	


