package com.java.designpattern.abstractFactoryMethod;

public class MensWearFactory  extends AbstractDressFactory {
 
    @Override
    public AbstractDress placeOrder(String itemName, int quantity) {
        return new MensWear(itemName,quantity);
    }
 
}
