package io.designpatterns.addons.toppings;

import io.designpatterns.addons.AddOn;

public class Oreo implements AddOn {

    private AddOn addOn;

    public Oreo(AddOn addOn){
        this.addOn = addOn;
    }
    @Override
    public double getCost() {
        return addOn.getCost() + 10;
    }

    @Override
    public String getDescription() {
        return "Oreo, "+ addOn.getDescription() ;
    }
}
