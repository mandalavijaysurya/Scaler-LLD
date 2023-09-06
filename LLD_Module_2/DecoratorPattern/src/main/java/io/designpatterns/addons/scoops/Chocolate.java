package io.designpatterns.addons.scoops;

import io.designpatterns.addons.AddOn;

public class Chocolate implements AddOn {

    private AddOn addOn;

    public Chocolate(AddOn addOn){
        this.addOn = addOn;
    }
    @Override
    public double getCost() {
        return addOn.getCost() + 10;
    }

    @Override
    public String getDescription() {
        return "Chocolate scoop, " + addOn.getDescription();
    }
}
