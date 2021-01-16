package com.java.designpattern.factoryMethod;

public class VegBriyani extends Briyani {
	@Override
	public void addRice() {
		System.out.println("Adding Rice for Vegetable Briyani");
	}
	@Override
	public void addMasala() {
		System.out.println("Adding Masals for Vegetable Briyani");
	}
	@Override
	public void addCurry() {
		System.out.println("Adding  curry for Vegetable Briyani");
	}

}
