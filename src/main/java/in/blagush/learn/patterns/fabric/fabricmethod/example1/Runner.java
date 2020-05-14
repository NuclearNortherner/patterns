package in.blagush.learn.patterns.fabric.fabricmethod.example1;

public class Runner {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new GomelPizzaStore();
        pizzaStore.orderPizza("meat");
        pizzaStore.orderPizza("vegan");


        System.out.println();
        pizzaStore = new RechicaPizzaStore();
        pizzaStore.orderPizza("meat");
        pizzaStore.orderPizza("vegan");
    }
}
