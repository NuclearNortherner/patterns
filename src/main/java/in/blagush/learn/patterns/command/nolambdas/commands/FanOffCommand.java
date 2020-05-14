package in.blagush.learn.patterns.command.nolambdas.commands;

import in.blagush.learn.patterns.command.nolambdas.entities.Fan;

public class FanOffCommand extends AbstractFanCommand {

    public FanOffCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        previousSpeed = fan.getSpeed();
        fan.setOff();
    }

}
