package in.blagush.learn.patterns.composepatterns.duck;

import in.blagush.learn.patterns.composepatterns.interfaces.Observable;
import in.blagush.learn.patterns.composepatterns.interfaces.Observer;
import in.blagush.learn.patterns.composepatterns.interfaces.Quackable;

public class RedheadDuck implements Quackable {

    Observable observable;

    public RedheadDuck() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Quack");
        notifyObservers();
    }

    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }
    public void notifyObservers() {
        observable.notifyObservers();
    }

}
