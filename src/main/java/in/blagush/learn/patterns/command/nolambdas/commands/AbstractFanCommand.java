package in.blagush.learn.patterns.command.nolambdas.commands;

import in.blagush.learn.patterns.command.nolambdas.entities.Fan;

abstract class AbstractFanCommand implements Command {
    Fan fan;
    int previousSpeed;

    @Override
    public void undo() {
        if (previousSpeed == Fan.HIGH) {
            fan.setHigh();

        } else if (previousSpeed == Fan.MEDIUM) {
            fan.setMedium();

        } else if (previousSpeed == Fan.LOW) {
            fan.setLow();

        } else if (previousSpeed == Fan.OFF) {
            fan.setOff();
        }
    }

    public Fan getFan() {
        return fan;
    }

    public void setFan(Fan fan) {
        this.fan = fan;
    }

    public int getPreviousSpeed() {
        return previousSpeed;
    }

    public void setPreviousSpeed(int previousSpeed) {
        this.previousSpeed = previousSpeed;
    }
}
