package com.java.designpattern.abstractFactoryMethod;

public class LadiesWearFactory  extends AbstractDressFactory {
 
    @Override
    public AbstractDress placeOrder(String itemName, int quantity) {
        return new LadiesWear(itemName,quantity);
    }
 
} 
