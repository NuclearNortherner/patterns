package in.blagush.learn.patterns.fabric.abstractmethod;

import in.blagush.learn.patterns.fabric.abstractmethod.ingredients.PizzaIngredientFactory;
import in.blagush.learn.patterns.fabric.abstractmethod.ingredients.RechicaPizzaIngredientFactory;

public class RechicaPizzaStore extends PizzaStore {
    Pizza pizza = null;
    PizzaIngredientFactory ingredientFactory =
            new RechicaPizzaIngredientFactory();

    @Override
    Pizza createPizza(String type) {
        Pizza pizza;

        if (type.equals("meat")) {
            pizza = new MeatPizza(ingredientFactory);
            pizza.setName(" Rechica cheese pizza ");
        } else {
            pizza = new VeganPizza(ingredientFactory);
            pizza.setName(" Rechica vegan pizza ");
        }

        return  pizza;
    }
}
