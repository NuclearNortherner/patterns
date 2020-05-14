package in.blagush.learn.patterns.facade;

import in.blagush.learn.patterns.facade.Entities.Fan;
import in.blagush.learn.patterns.facade.Entities.Lamp;
import in.blagush.learn.patterns.facade.Entities.Water;
import in.blagush.learn.patterns.facade.facades.Bathroom;

public class Runner {
    public static void main(String[] args) {

        Bathroom bathroom = new Bathroom(new Fan(), new Lamp(), new Water());

        bathroom.start();

        bathroom.stop();

    }
}
