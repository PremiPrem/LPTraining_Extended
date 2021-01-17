package com.lptraining.wrapper;

import java.util.Scanner;


import com.lptraining.election.Voter;
import com.lptraining.exception.AccessDeniedException;

public class Checked {

		 Scanner scanner = new Scanner(System.in);
	        int age = scanner.nextInt();
	        
	    	public Voter access(int age) throws AccessDeniedException{
				if(age < 18) 
				throw new AccessDeniedException("Cannot perform Voting at " + age);
				else
					return new Voter();
				
				}
}
