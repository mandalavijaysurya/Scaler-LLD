package pizzas.basepizzas;

import pizzas.Pizza;

public class Pepperoni implements Pizza{

    @Override
    public int getCost() {
        return 180;
    }

    @Override
    public String getDescription() {
        return "Pepperoni";
    }
    
}
