package in.blagush.learn.patterns.observer.catexample;

import in.blagush.learn.patterns.observer.catexample.interfaces.Observer;
import in.blagush.learn.patterns.observer.catexample.interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

public class CatOwner implements Subject {

    private List<Observer> observers;
    private List<String> news;

    public CatOwner() {
        observers = new ArrayList<>();
        news = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if (index >=0 ) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        String lastPost = news.get(news.size() - 1);
        for (Observer observer : observers) {
            observer.update(lastPost);
        }
    }

    public void setNewPost(String newPost) {
        news.add(newPost);
        notifyObservers();
    }

}
