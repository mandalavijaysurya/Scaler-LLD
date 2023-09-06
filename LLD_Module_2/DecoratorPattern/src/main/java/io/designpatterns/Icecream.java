package io.designpatterns;

import io.designpatterns.addons.AddOn;

public class Icecream {
    private AddOn addOn;

    public Icecream(AddOn addOn){
        this.addOn = addOn;
    }

    public double getCost() {
        return addOn.getCost();
    }

    public String getDescription(){
        return addOn.getDescription();
    }

}
