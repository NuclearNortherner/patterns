package in.blagush.learn.patterns.observer.bookexample.interfaces;

public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();

}
