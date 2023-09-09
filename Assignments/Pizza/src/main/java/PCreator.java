import main.pizzas.Pizza;
import main.pizzas.addons.Cheese;
import main.pizzas.addons.Paneer;
import main.pizzas.addons.Tomato;
import main.pizzas.basepizzas.BBQChicken;

/**
 * PCreator
 */
public class PCreator {
    public static void main(String[] args) {
        Pizza pizza = new Paneer(new Cheese(new Tomato(new BBQChicken())));
        System.out.println(pizza.getCost()); // should output 370
        System.out.println(pizza.getDescription()); // should output BBChicken + Tomato + Cheese + Paneer
    }

}
