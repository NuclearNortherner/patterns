package in.blagush.learn.patterns.observer.catexample;

import in.blagush.learn.patterns.observer.catexample.interfaces.Action;
import in.blagush.learn.patterns.observer.catexample.interfaces.Observer;
import in.blagush.learn.patterns.observer.catexample.interfaces.Subject;

public class Dima implements Observer, Action {

    private final String name = "Dima";
    private String news;
    private Subject subject;

    public Dima(Subject subject) {
        this.subject = subject;
        subject.addObserver(this);
    }

    @Override
    public void action() {
        System.out.println(name + " liked the post \"" + news + "\"");
    }

    @Override
    public void update(String news) {
        this.news = news;
        action();
    }

    @Override
    public void subscribe(Subject subject) {
        subject.addObserver(this);
    }

    @Override
    public void unsubscribe() {
        subject.deleteObserver(this);
    }
}
