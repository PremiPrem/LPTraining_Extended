package com.java.designpattern.prototype;

public class Car extends Vehicle {

	private String type;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "Car{" +"type" + type + '\'' + '}';
	} 

}
