package com.lptraining.wrapper;


	import java.io.FileNotFoundException;
import java.util.Scanner;


public class Unchecked {
	
	 public static void main(String[] args){
	        Scanner scanner = new Scanner(System.in);
	       Unchecked file = new Unchecked();
	        System.out.println("Enter your id ");
	        String id = scanner.next();


	        try{

	            if(!(id.trim().matches("^[0-9]{9}[vVxX]$")))
	            {
	                throw new FileNotFoundException("File ID is not match");
	            }

	        }
	        catch(FileNotFoundException ex){
	            ex.printStackTrace();
	        }
	    }
}



	
