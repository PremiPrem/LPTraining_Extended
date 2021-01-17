package com.java.designpattern.prototype;

public class ProtoType {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Registry registry=new Registry();
		
		Car car =(Car) registry.getVehicle(VehicleType.CAR);
		System.out.println(car);
		
		
		car.setType("Luxury");
		System.out.println(car);

		Car car1 =(Car) registry.getVehicle(VehicleType.CAR);
		System.out.println(car1);
	}

}
