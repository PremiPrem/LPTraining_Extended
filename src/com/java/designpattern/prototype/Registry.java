package com.java.designpattern.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {
	private Map<VehicleType, Vehicle> vehicles =new HashMap<>();

	public Registry() {
		// TODO Auto-generated constructor stub
		this.initialize();
	}
	
	public Vehicle getVehicle(VehicleType vehicleType) {
		Vehicle vehicle=null;
		try {
			vehicle=(Vehicle)vehicles.get(vehicleType).clone();
		}
		catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return vehicle;
	}
	
	private void initialize() {
		
		Car car=new Car();
		car.setEngineCapacity(2000);
		car.setType("Audi");
		car.setFuelType("Gasoline");
		
		Bus bus=new Bus();
		bus.setEngineCapacity(3000);
		bus.setNumberOfSeats(32);
		bus.setFuelType("Diesel");
		
		vehicles.put(VehicleType.CAR,car);
		vehicles.put(VehicleType.BUS,bus);
		
	}

}
