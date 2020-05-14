package in.blagush.learn.patterns.strategy.interfaces;

public class ChildCommunicationBehavior implements CommunicationBehavior {
    @Override
    public void communicate() {
        System.out.println("Hi, little one");
    }
}
