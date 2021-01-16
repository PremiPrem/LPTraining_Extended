package com.java.designpattern.builder;

public class BuilderDesignPattern {
    public static void main(String[] args) {
 
        Vehicle car = Owner.buy("CAR");
        System.out.println(car);
 
        Vehicle bus = Owner.buy("BUS");
        System.out.println(bus);
    }
}