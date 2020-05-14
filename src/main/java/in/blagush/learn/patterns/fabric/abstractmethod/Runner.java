package in.blagush.learn.patterns.fabric.abstractmethod;

public class Runner {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new GomelPizzaStore();
        System.out.println(pizzaStore.orderPizza("meat").toString());
        pizzaStore.orderPizza("vegan");



        System.out.println();
        pizzaStore = new RechicaPizzaStore();
        System.out.println(pizzaStore.orderPizza("meat").toString());
        pizzaStore.orderPizza("vegan");
    }
}
