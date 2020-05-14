package in.blagush.learn.patterns.strategy;

import in.blagush.learn.patterns.strategy.interfaces.CommunicationBehavior;
import in.blagush.learn.patterns.strategy.interfaces.WorkBehavior;

public class RobotSolder extends Robot {
    public RobotSolder(int id, CommunicationBehavior communicationBehavior, WorkBehavior workBehavior) {
        super(id, communicationBehavior, workBehavior);
    }
}
