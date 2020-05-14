package in.blagush.learn.patterns.command.nolambdas.commands;

import in.blagush.learn.patterns.command.nolambdas.entities.Fan;

public class FanLowCommand extends AbstractFanCommand {

    public FanLowCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        previousSpeed = fan.getSpeed();
        fan.setLow();
    }

}
