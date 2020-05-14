package in.blagush.learn.patterns.strategy.interfaces;

public class PlantWorkBehavior implements WorkBehavior {
    @Override
    public void work() {
        System.out.println("Working as bending unit");
    }
}
