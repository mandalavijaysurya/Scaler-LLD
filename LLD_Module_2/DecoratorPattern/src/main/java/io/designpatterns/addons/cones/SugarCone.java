package io.designpatterns.addons.cones;

import io.designpatterns.addons.AddOn;

public class SugarCone implements AddOn {

    private AddOn addOn;
    public SugarCone(){

    }

    public SugarCone(AddOn addon){
        this.addOn = addon;
    }


    @Override
    public double getCost() {
        if(addOn == null)
            return 10;
        return addOn.getCost() + 10;
    }

    @Override
    public String getDescription() {
        if(addOn == null)
            return "with Sugar cone";
        return addOn.getDescription() + "Sugar cone";
    }
}
