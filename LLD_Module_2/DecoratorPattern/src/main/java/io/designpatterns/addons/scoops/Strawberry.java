package io.designpatterns.addons.scoops;

import io.designpatterns.addons.AddOn;

public class Strawberry implements AddOn {

    private AddOn addOn;

    public Strawberry(AddOn addOn){
        this.addOn = addOn;
    }
    @Override
    public double getCost() {
        return addOn.getCost() + 10;
    }

    @Override
    public String getDescription() {
        return "Strawberry scoop, " + addOn.getDescription();
    }
}
