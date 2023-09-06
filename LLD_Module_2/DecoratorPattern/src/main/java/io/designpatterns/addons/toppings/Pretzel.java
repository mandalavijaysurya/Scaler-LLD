package io.designpatterns.addons.toppings;

import io.designpatterns.addons.AddOn;

public class Pretzel implements AddOn {

    private AddOn addOn;

    public Pretzel(AddOn addOn){
        this.addOn = addOn;
    }
    @Override
    public double getCost() {
        return 10;
    }

    @Override
    public String getDescription() {
        return "Pretzel, "+ addOn.getDescription() ;
    }
}
