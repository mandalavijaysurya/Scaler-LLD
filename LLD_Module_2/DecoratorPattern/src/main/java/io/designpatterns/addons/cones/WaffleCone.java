package io.designpatterns.addons.cones;

import io.designpatterns.addons.AddOn;

public class WaffleCone implements AddOn {

    private AddOn addOn;
    public WaffleCone(){

    }
    public WaffleCone(AddOn addon){
        this.addOn = addon;
    }
    @Override
    public double getCost() {
        if(addOn == null)
            return 25;
        return addOn.getCost() + 25;
    }

    @Override
    public String getDescription() {
        if(addOn == null)
            return "with Waffle cone";
        return addOn.getDescription() + "Waffle cone, ";
    }
}
