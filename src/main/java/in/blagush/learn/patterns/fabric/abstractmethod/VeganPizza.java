package in.blagush.learn.patterns.fabric.abstractmethod;

import in.blagush.learn.patterns.fabric.abstractmethod.ingredients.PizzaIngredientFactory;

public class VeganPizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public VeganPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clam = ingredientFactory.createClam();
    }
}
