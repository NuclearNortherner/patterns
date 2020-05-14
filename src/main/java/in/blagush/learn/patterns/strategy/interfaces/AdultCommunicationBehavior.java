package in.blagush.learn.patterns.strategy.interfaces;

public class AdultCommunicationBehavior implements CommunicationBehavior {
    @Override
    public void communicate() {
        System.out.println("Hello, sir/madam");
    }
}
