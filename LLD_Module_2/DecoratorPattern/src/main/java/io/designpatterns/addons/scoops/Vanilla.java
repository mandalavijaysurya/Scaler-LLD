package io.designpatterns.addons.scoops;

import io.designpatterns.addons.AddOn;

public class Vanilla implements AddOn {

    private AddOn addOn;

    public Vanilla(AddOn addOn){
        this.addOn = addOn;
    }
    @Override
    public double getCost() {
        return addOn.getCost() + 10;
    }

    @Override
    public String getDescription() {
        return "Vanilla scoop, "+ addOn.getDescription();
    }
}