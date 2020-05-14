package in.blagush.learn.patterns.fabric.fabricmethod.example1;

public abstract class PizzaStore {

    public final Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    abstract Pizza createPizza(String type);

}
