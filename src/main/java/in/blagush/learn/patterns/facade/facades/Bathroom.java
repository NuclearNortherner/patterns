package in.blagush.learn.patterns.facade.facades;

import in.blagush.learn.patterns.facade.Entities.Fan;
import in.blagush.learn.patterns.facade.Entities.Lamp;
import in.blagush.learn.patterns.facade.Entities.Water;

public class Bathroom {
    private Fan fan;
    private Lamp lamp;
    private Water water;

    public Bathroom(Fan fan, Lamp lamp, Water water) {
        this.fan = fan;
        this.lamp = lamp;
        this.water = water;
    }

    public void start() {
        lamp.turnOn();
        water.open();
        fan.turnMediumSpeed();
    }

    public void stop() {
        water.close();
        fan.turnOff();
        lamp.turnOff();
    }


}
