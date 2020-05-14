package in.blagush.learn.patterns.observer.catexample;

import in.blagush.learn.patterns.observer.catexample.interfaces.Action;
import in.blagush.learn.patterns.observer.catexample.interfaces.Observer;
import in.blagush.learn.patterns.observer.catexample.interfaces.Subject;

public class Mom implements Observer, Action {

    private final String name = "Mom";
    private String news;
    private Subject subject;

    public Mom(Subject subject) {
        this.subject = subject;
        subject.addObserver(this);
    }

    @Override
    public void action() {
        System.out.println(name + " liked the post \"" + news + "\" and told husband about it");
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
