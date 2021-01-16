package com.java.designpattern.abstractFactoryMethod;

public class Customer {
    public AbstractDress placeOrder(String itemName,int quantity,String itemType) {
        AbstractDressFactory a = null;
        if(itemType.equals("ladies")) {
            a = new LadiesWearFactory();
        }else if(itemType.equals("men")) {
            a = new MensWearFactory();
        }else if(itemType.equals("kids")) {
            a = new KidsWearFactory();
        }
        if(a!=null) {
            return a.placeOrder(itemName, quantity);
        }else {
            return null;
        }
    }
}


