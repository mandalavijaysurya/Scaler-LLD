package main.pizzas.basepizzas;

import main.pizzas.Pizza;

public class FarmHouse implements Pizza{

    @Override
    public int getCost() {
        return 150;
    }

    @Override
    public String getDescription() {
        return "FarmHouse";
    }
    
}
