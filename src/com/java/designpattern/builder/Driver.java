package com.java.designpattern.builder;

public abstract  class Driver {
	private Vehicle vehicle;
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public final Vehicle drive() {
		Vehicle vehicle = driveVehicle();
		setVehicle(vehicle);
		setVehicleType();
		setEngineCapacity();
		setFuelType();
		return vehicle;
	}
	abstract void setVehicleType();
	abstract void setEngineCapacity();
	abstract void setFuelType();
	abstract Vehicle driveVehicle();
	 

}
