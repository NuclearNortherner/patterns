package in.blagush.learn.patterns.fabric.fabricmethod.example1;

public class RechicaMeatPizza extends Pizza {

    public RechicaMeatPizza() {
        name = "Rechica Style meat Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Grated Reggiano Cheese");
    }

    @Override
    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
