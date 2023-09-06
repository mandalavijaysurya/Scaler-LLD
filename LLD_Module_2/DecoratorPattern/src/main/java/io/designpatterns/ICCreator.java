package io.designpatterns;

import io.designpatterns.addons.cones.CakeCone;
import io.designpatterns.addons.cones.WaffleCone;
import io.designpatterns.addons.scoops.Chocolate;
import io.designpatterns.addons.scoops.Vanilla;
import io.designpatterns.addons.toppings.Oreo;

public class ICCreator {
    public static void main(String[] args) {
        Icecream icecream = new Icecream(
            new Vanilla(
            new Chocolate(
            new Oreo(
            new WaffleCone()))));
        System.out.println("Ice-cream is: "+ icecream.getDescription());
        System.out.println("Cost of Ice-cream you have created is "+icecream.getCost());


    }
}