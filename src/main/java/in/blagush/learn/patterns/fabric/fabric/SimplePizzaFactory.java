package in.blagush.learn.patterns.fabric.fabric;

public class SimplePizzaFactory {

    public Pizza createPizza(String type) {

        Pizza pizza;

        if (type.equals("meat")) {
            pizza = new MeatPizza();
        } else if (type.equals("mini")) {
            pizza = new MiniPizza();
        } else {
            pizza = new VeganPizza();
        }

        return  pizza;
    }

}
