package in.blagush.learn.patterns.fabric.abstractmethod;

import in.blagush.learn.patterns.fabric.abstractmethod.ingredients.GomelPizzaIngredientFactory;
import in.blagush.learn.patterns.fabric.abstractmethod.ingredients.PizzaIngredientFactory;

public class GomelPizzaStore extends PizzaStore {
    Pizza pizza = null;
    PizzaIngredientFactory ingredientFactory =
            new GomelPizzaIngredientFactory();

    @Override
    Pizza createPizza(String type) {
        Pizza pizza;

        if (type.equals("meat")) {
            pizza = new MeatPizza(ingredientFactory);
            pizza.setName(" Gomel cheese pizza ");
        } else {
            pizza = new VeganPizza(ingredientFactory);
            pizza.setName(" Gomel vegan pizza ");
        }

        return  pizza;
    }
}
