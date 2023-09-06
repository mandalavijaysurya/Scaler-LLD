package io.designpatterns.addons.toppings;

import io.designpatterns.addons.AddOn;

public class Honey implements AddOn {

    private AddOn addOn;

    public Honey(AddOn addOn){
        this.addOn = addOn;
    }
    @Override
    public double getCost() {
        return addOn.getCost() + 10;
    }

    @Override
    public String getDescription() {
        return "Honey, " + addOn.getDescription();
    }
}
