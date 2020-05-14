package in.blagush.learn.patterns.observer.catexample.interfaces;

public interface Subject {

    void addObserver(Observer observer);

    void deleteObserver(Observer observer);

    void notifyObservers();

}
