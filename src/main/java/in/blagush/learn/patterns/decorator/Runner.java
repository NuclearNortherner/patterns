package in.blagush.learn.patterns.decorator;

public class Runner {
    public static void main(String[] args) {

        Beverage beverage = new BlackTea();
        beverage = new Milk(beverage);
        beverage = new Lemon(beverage);

        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());

    }
}
