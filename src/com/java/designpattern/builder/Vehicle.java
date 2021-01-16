package com.java.designpattern.builder;

public class Vehicle {
	private String fuelType;
	private int engineCapacity;
	
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public int getEngineCapacity() {
		return engineCapacity;
	}
	public void setEngineCapacity(int engineCapacity) {
		this.engineCapacity = engineCapacity;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Fuel Type" +fuelType + "Engine Capacity" +engineCapacity;
	}
	
}
