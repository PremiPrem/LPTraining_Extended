package com.lptraining.election;

import com.lptraining.exception.UserNotFoundException;

public class VoterPermission {

	
		public VoterPermission(){		
		}
	

public Voter authenticate(String NId) throws UserNotFoundException{
			if(NId.equals("123456789v")) {
				return new Voter();
			} else {
				throw new UserNotFoundException("invalid NIC No " + NId);
			}
	
	}





}




