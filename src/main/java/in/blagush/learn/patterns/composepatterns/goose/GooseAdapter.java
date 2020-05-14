package in.blagush.learn.patterns.composepatterns.goose;

import in.blagush.learn.patterns.composepatterns.goose.Goose;
import in.blagush.learn.patterns.composepatterns.interfaces.Observer;
import in.blagush.learn.patterns.composepatterns.interfaces.Quackable;

public class GooseAdapter implements Quackable {
    private Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }

    @Override
    public void registerObserver(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }
}
