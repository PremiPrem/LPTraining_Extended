package com.java.designpattern.factoryMethod;

public class ChickenBriyani extends Briyani {
	@Override
	public void addRice() {
		System.out.println("Adding Rice for ChickenBriyani");
	}
	@Override
	public void addMasala() {
		System.out.println("Adding Masals for ChickenBriyani");
	}
	@Override
	public void addCurry() {
		System.out.println("Adding Chicken curry for ChickenBriyani");
	}
}
