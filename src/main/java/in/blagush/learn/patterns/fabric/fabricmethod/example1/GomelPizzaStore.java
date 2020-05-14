package in.blagush.learn.patterns.fabric.fabricmethod.example1;

public class GomelPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        Pizza pizza;

        if (type.equals("meat")) {
            pizza = new GomelMeatPizza();
        } else if (type.equals("mini")) {
            pizza = new GomelMiniPizza();
        } else {
            pizza = new GomelVeganPizza();
        }

        return  pizza;
    }
}
