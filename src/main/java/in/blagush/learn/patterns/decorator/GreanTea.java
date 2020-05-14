package in.blagush.learn.patterns.decorator;

public class GreanTea implements Beverage {
    @Override
    public String getDescription() {
        return "Green tea";
    }

    @Override
    public double cost() {
        return 2;
    }
}
