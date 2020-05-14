package in.blagush.learn.patterns.strategy.interfaces;

public class WarWorkBehavior implements WorkBehavior {
    @Override
    public void work() {
        System.out.println("Defending out great fatherland");
    }
}
