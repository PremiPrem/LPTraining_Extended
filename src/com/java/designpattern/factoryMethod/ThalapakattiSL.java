package com.java.designpattern.factoryMethod;

public class ThalapakattiSL extends Thalapakatti {
	@Override
    public  Briyani createBriyani(String type){
        Briyani briyani;
        switch (type.toLowerCase())
        {
            case "chickenBriyani":
                briyani = new ChickenBriyani();
                break;
            case "vegBriyani":
                briyani = new VegBriyani();
                break;
     
            default: throw new IllegalArgumentException("No such Briyani.");
        }
  
       briyani.addRice();
       briyani.addMasala();
       briyani.addCurry();
        return briyani;
    }
	

}
