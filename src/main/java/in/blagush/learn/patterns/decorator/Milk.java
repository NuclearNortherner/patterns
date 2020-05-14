package in.blagush.learn.patterns.decorator;

public class Milk extends BeverageDecorator {
    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", milk";
    }

    @Override
    public double cost() {
        return 0.8 + getBeverage().cost();
    }
}
