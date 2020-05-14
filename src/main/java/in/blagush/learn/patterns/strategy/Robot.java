package in.blagush.learn.patterns.strategy;

import in.blagush.learn.patterns.strategy.interfaces.CommunicationBehavior;
import in.blagush.learn.patterns.strategy.interfaces.WorkBehavior;

public abstract class Robot {

    private int id;

    private CommunicationBehavior communicationBehavior;

    private WorkBehavior workBehavior;

    public Robot(int id, CommunicationBehavior communicationBehavior, WorkBehavior workBehavior) {
        this.id = id;
        this.communicationBehavior = communicationBehavior;
        this.workBehavior = workBehavior;
    }

    public void performWork() {
        workBehavior.work();
    }

    public void performCommunication() {
        communicationBehavior.communicate();
    }

    public int getId() {
        return id;
    }

    public void setCommunicationBehavior(CommunicationBehavior communicationBehavior) {
        this.communicationBehavior = communicationBehavior;
    }

    public void setWorkBehavior(WorkBehavior workBehavior) {
        this.workBehavior = workBehavior;
    }
}
