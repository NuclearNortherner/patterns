package in.blagush.learn.patterns.composepatterns.duck;

import in.blagush.learn.patterns.composepatterns.interfaces.Observable;
import in.blagush.learn.patterns.composepatterns.interfaces.Observer;
import in.blagush.learn.patterns.composepatterns.interfaces.Quackable;

public class RubberDuck implements Quackable {


    Observable observable;

    public RubberDuck() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Squeak");
        notifyObservers();
    }

    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
