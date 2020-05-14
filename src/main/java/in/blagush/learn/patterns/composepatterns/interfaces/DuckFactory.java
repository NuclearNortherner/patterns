package in.blagush.learn.patterns.composepatterns.interfaces;

import in.blagush.learn.patterns.composepatterns.duck.DuckCall;
import in.blagush.learn.patterns.composepatterns.duck.MallardDuck;
import in.blagush.learn.patterns.composepatterns.duck.RedheadDuck;
import in.blagush.learn.patterns.composepatterns.duck.RubberDuck;

public class DuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }
}
