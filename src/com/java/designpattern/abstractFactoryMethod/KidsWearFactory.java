package com.java.designpattern.abstractFactoryMethod;

public class KidsWearFactory  extends AbstractDressFactory {
 
    @Override
    public AbstractDress placeOrder(String itemName, int quantity) {
        return new KidsWear(itemName,quantity);
    }
 
} 


