package in.blagush.learn.patterns.decorator;

public class BlackTea implements Beverage {
    @Override
    public String getDescription() {
        return "Black tea";
    }

    @Override
    public double cost() {
        return 2;
    }
}
