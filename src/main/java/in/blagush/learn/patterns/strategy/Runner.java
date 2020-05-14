package in.blagush.learn.patterns.strategy;

import in.blagush.learn.patterns.strategy.interfaces.*;

public class Runner {
    public static void main(String[] args) {

        Robot solder = new RobotSolder(1, new WarCommunicationBehavior(), new WarWorkBehavior());
        Robot toy = new RobotToy(2, new ChildCommunicationBehavior(), new NoWorkBehavior());

        System.out.println(solder.getId());
        solder.performCommunication();
        solder.performWork();

        System.out.println(toy.getId());
        toy.performCommunication();
        toy.performWork();

        System.out.println(toy.getId());
        toy.setCommunicationBehavior(new AdultCommunicationBehavior());
        toy.performCommunication();
        toy.performWork();

    }
}
