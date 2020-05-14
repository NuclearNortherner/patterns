package in.blagush.learn.patterns.state.interfaces;

public interface State {

    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
    void refill();

}
