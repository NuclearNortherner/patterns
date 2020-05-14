package in.blagush.learn.patterns.strategy.interfaces;

public class TaxiWorkBehavior implements WorkBehavior {
    @Override
    public void work() {
        System.out.println("Working as taxi driver");
    }
}
