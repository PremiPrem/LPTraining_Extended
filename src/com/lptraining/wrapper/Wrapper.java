package com.lptraining.wrapper;

import java.util.Scanner;


import com.lptraining.exception.InvalidProcessException;
import com.lptraining.exception.UserNotFoundException;

public class Wrapper {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		        System.out.println("Enter your id ");
		        Scanner scanner = new Scanner(System.in);
		        String id = scanner.next();
		        
			try{
				if(!(id.trim().matches("123456789v")))
			throw new UserNotFoundException("Can't Perform this Voting Process for this ID");				
	}
			 catch(UserNotFoundException ex) {
				 throw new InvalidProcessException("This is an invalid Process");
				
			}
		
	}
}
