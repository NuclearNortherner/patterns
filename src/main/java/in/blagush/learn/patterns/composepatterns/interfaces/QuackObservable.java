package in.blagush.learn.patterns.composepatterns.interfaces;

public interface QuackObservable {
    public void registerObserver(Observer observer);
    public void notifyObservers();
}
