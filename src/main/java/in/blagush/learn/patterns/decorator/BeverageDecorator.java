package in.blagush.learn.patterns.decorator;

public abstract class BeverageDecorator implements Beverage {

    Beverage beverage;

    public BeverageDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    public Beverage getBeverage() {
        return beverage;
    }

    public abstract String getDescription();

    public abstract double cost();

}
