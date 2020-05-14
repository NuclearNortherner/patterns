package in.blagush.learn.patterns.observer.catexample.interfaces;

public interface Observer {

    void update(String news);

    void subscribe(Subject subject);

    void unsubscribe();

}
