package io.designpatterns.addons.cones;

import io.designpatterns.addons.AddOn;

public class CakeCone implements AddOn {
    private AddOn addOn;
    public CakeCone(){

    }

    public CakeCone(AddOn addon){
        this.addOn = addon;
    }


    @Override
    public double getCost() {
        if(addOn == null)
            return 20;
        return addOn.getCost() + 20;
    }

    @Override
    public String getDescription() {
        if(addOn == null)
            return "with Cake cone";
        return addOn.getDescription() + "Cake cone";
    }
}
