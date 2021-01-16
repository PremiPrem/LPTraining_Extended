package com.java.designpattern.builder;

public  class Bus extends Driver {
	 Vehicle driveVehicle() {
		 return new Vehicle();
	 }
	 public void setEngineCapacity() {
	     System.out.println("Engine Capacity : Focus on best Engine Capacity");
	     getVehicle().setEngineCapacity(3000);
	 }
	 public void setFuelType() {
	     System.out.println("Fuel Type : Focus on bect Fuel Type");
	     getVehicle().setFuelType("Petrol");
	 }
	  void setVehicleType() {
	     System.out.println("Vehicle Type :Bus");
	     getVehicle().setFuelType("Bus");
	 }
	 


	}
