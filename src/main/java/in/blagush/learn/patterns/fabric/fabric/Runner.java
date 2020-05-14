package in.blagush.learn.patterns.fabric.fabric;

public class Runner {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());
        pizzaStore.orderPizza("meat");
        pizzaStore.orderPizza("vegan");
    }
}
