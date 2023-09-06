package io.designpatterns.addons.toppings;

import io.designpatterns.addons.AddOn;

public class Fruit implements AddOn {

    private AddOn addOn;

    public Fruit(AddOn addOn){
        this.addOn = addOn;
    }
    @Override
    public double getCost() {
        return addOn.getCost() + 10;
    }

    @Override
    public String getDescription() {
        return  "Fruit, " + addOn.getDescription();
    }
}
