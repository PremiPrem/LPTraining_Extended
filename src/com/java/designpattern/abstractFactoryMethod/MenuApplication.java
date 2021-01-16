package com.java.designpattern.abstractFactoryMethod;

import java.util.ArrayList;

public class MenuApplication {
    ArrayList<AbstractDress> order;
    public static void main(String[] args) {
        MenuApplication m = new MenuApplication();
        m.createOrder();
    }
    public boolean createOrder() {
        boolean orderCreated = false;
        Customer c = new Customer();
        order = new ArrayList<AbstractDress>();
        order.add(c.placeOrder("Saree", 2, "frock"));
        order.add(c.placeOrder("Jeans", 3, "Tshirt"));
        order.add(c.placeOrder("shorts", 1, "shirt"));
        System.out.println(order);
        return orderCreated;
    }
 
}