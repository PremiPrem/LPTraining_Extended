package com.java.designpattern.singleton;

public class Singleton {
	
	 
	 
	    // Static attribute.
	    private static Singleton instance = null;
	 
	    // Private constructor.
	    private Singleton() {
	 
	    }
	 
	    // Static function.
	    public static Singleton getInstance() {
	        // If there is no instance available, create new one (i.e. lazy initialization).
	        if (instance == null) {
	            instance = new Singleton();
	        }
	        return instance;
	    }
	}


