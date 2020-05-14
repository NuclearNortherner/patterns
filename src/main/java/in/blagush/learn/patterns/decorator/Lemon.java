package in.blagush.learn.patterns.decorator;

public class Lemon extends BeverageDecorator {

    public Lemon(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return getBeverage().getDescription() + ", lemon";
    }

    @Override
    public double cost() {
        return 0.5 + getBeverage().cost();
    }
}
