package in.blagush.learn.patterns.composepatterns.duck;

import in.blagush.learn.patterns.composepatterns.interfaces.Observable;
import in.blagush.learn.patterns.composepatterns.interfaces.Observer;
import in.blagush.learn.patterns.composepatterns.interfaces.Quackable;

public class DuckCall implements Quackable {
    Observable observable;

    public DuckCall() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Kwak");
        notifyObservers();
    }

    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }
    public void notifyObservers() {
        observable.notifyObservers();
    }

}
