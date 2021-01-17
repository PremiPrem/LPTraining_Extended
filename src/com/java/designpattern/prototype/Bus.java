package com.java.designpattern.prototype;

public class Bus extends Vehicle {

	private int numberOfSeats;
	
	public int getNumberOfSeats() {
		return numberOfSeats;
	}
	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Bus{" +"numberOfSeats" + numberOfSeats + '}';
	} 

}
