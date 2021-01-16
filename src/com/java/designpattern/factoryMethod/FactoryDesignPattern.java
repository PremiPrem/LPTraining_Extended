package com.java.designpattern.factoryMethod;

public class FactoryDesignPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thalapakatti thalapakatti = new ThalapakattiSL();
        Briyani chickenBriyani = thalapakatti.createBriyani("Chicken Briyani");
        Briyani vegBriyani = thalapakatti.createBriyani("Veg Briyani");
    }
	}


