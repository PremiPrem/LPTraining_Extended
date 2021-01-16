package com.java.designpattern.factoryMethod;

public abstract class Briyani {
	
	public abstract void addRice();
	public abstract void addMasala();
	public abstract void addCurry();
	
	public void makeBriyani() {
		System.out.println("Briyani is ready");
	}

}
