package com.java.designpattern.builder;

public  class Car extends Driver {
 Vehicle driveVehicle() {
	 return new Vehicle();
 }
 public void setEngineCapacity() {
     System.out.println("Engine Capacity : Focus on bect Engine Capacity");
     getVehicle().setEngineCapacity(2000);
 }
 public void setFuelType() {
     System.out.println("Fuel Type : Focus on bect Fuel Type");
     getVehicle().setFuelType("Diesel");
 }
  void setVehicleType() {
     System.out.println("Fuel Type : Focus on bect Fuel Type");
     getVehicle().setFuelType("Car");
 }
 


}
