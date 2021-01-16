package com.java.designpattern.abstractFactoryMethod;

public class LadiesWear extends AbstractDress {
	    String itemName;
	    int quantity;
	    boolean delivered;
	     
	    public LadiesWear(String itemName2, int quantity2) {
			// TODO Auto-generated constructor stub
		}

		public String getItemName() {
	        return itemName;
	    }
	 
	    public void setItemName(String itemName) {
	        this.itemName = itemName;
	    }
	 
	    public int getQuantity() {
	        return quantity;
	    }
	 
	    public void setQuantity(int quantity) {
	        this.quantity = quantity;
	    }
	 
	    public boolean isDelivered() {
	        return delivered;
	    }
	 
	    public void setDelivered(boolean delivered) {
	        this.delivered = delivered;
	    }
	 
	}


