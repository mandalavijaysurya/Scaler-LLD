package io.designpatterns.addons.toppings;

import io.designpatterns.addons.AddOn;

public class StrawberryFluff implements AddOn {

    private AddOn addOn;

    public StrawberryFluff(AddOn addOn){
        this.addOn = addOn;
    }
    @Override
    public double getCost() {
        return addOn.getCost() + 10;
    }

    @Override
    public String getDescription() {
        return "Strawberry fluff, " + addOn.getDescription() ;
    }
}
