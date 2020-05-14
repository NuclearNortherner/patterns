package in.blagush.learn.patterns.strategy.interfaces;

public class WarCommunicationBehavior implements CommunicationBehavior {
    @Override
    public void communicate() {
        System.out.println("Hi, colonel");
    }
}
