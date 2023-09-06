package io.designpatterns.addons.scoops;

import io.designpatterns.addons.AddOn;

public class Orange implements AddOn {

    private AddOn addOn;

    public Orange(AddOn addOn){
        this.addOn = addOn;
    }
    @Override
    public double getCost() {
        return addOn.getCost() + 10;
    }

    @Override
    public String getDescription() {
        return  "Orange scoop, " + addOn.getDescription();
    }
}