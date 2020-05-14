package in.blagush.learn.patterns.fabric.fabricmethod.example1;

public class RechicaPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        Pizza pizza;

        if (type.equals("meat")) {
            pizza = new RechicaMeatPizza();
        } else if (type.equals("mini")) {
            pizza = new RechicaMiniPizza();
        } else {
            pizza = new RechicaVeganPizza();
        }

        return  pizza;
    }
}
