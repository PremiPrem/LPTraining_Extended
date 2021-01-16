package com.lptraining.wrapper;


	import java.io.FileNotFoundException;


public class Wrapper {
	
	   
		    public void wrappingCheckException(){
		        try {
		            throw new FileNotFoundException();
		        } catch (FileNotFoundException e) {
		            throw new RuntimeException(e);
		        }
		    
		    }
		}

	
