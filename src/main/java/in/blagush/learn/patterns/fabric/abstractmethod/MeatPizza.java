package in.blagush.learn.patterns.fabric.abstractmethod;

import in.blagush.learn.patterns.fabric.abstractmethod.ingredients.PizzaIngredientFactory;

public class MeatPizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public MeatPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
