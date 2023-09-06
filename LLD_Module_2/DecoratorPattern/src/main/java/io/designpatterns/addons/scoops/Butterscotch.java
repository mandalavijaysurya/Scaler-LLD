package io.designpatterns.addons.scoops;

import io.designpatterns.addons.AddOn;

public class Butterscotch implements AddOn {

    private AddOn addOn;

    public Butterscotch(AddOn addOn){
        this.addOn = addOn;
    }
    @Override
    public double getCost() {
        return addOn.getCost() + 10;
    }

    @Override
    public String getDescription() {
        return "Butterscotch scoop, " + addOn.getDescription();
    }
}
