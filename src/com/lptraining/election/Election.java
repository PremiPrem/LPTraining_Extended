package com.lptraining.election;



import java.util.Scanner;

import com.lptraining.exception.VotingPermissionDeniedException;


public class Election {
	private static Scanner sc;

	public static void main(String[] args) {
		
			sc = new Scanner(System.in);
			System.out.println("Please enter the Voter Id number");
			int vId = sc.nextInt();
			sc = new Scanner(System.in);
			System.out.println("Please enter NIC");
			String NIC = sc.nextLine();
			sc = new Scanner(System.in);
			System.out.println("Please enter your  your Age");
			int age = sc.nextInt();
			try {
			 ElectionOfficer voting= new ElectionOfficer();
		    int voterDetail = voting.calculateVoterCount(vId, NIC, age);
			System.out.print(voterDetail);
			}
			catch(VotingPermissionDeniedException e) {
         	   e.printStackTrace();
         	   System.err.println( " Voting cannot proceed  " + e );	            
         	   }


				

					
		} 
		
	}

	                     

	


