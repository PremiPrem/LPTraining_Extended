package com.java.designpattern.builder;

public class Owner {
	
		 
	    public static Vehicle buy(String vehicleType) {
	 
	        Driver driver = null;
	 
	        if (vehicleType.equalsIgnoreCase("orange")) {
	            driver = new Car();
	        } else if (vehicleType.equalsIgnoreCase("apple")) {
	            driver = new Bus();
	        } else {
	            System.out.println("Sorry we don't take order for  " + vehicleType);
	        }
	        return driver.drive();
	    }
	 
	

}
