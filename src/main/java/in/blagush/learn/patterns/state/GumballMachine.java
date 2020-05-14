package in.blagush.learn.patterns.state;

import in.blagush.learn.patterns.state.interfaces.State;

public class GumballMachine {

    private State soldOutState;
    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;
    private State winnerstate;
    private State state = soldOutState;

    private String location;
    private int count = 0;

    public GumballMachine(String location, int numberGumballs) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerstate = new WinnerState(this);
        this.location = location;
        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = noQuarterState;
        } else {
            state = soldOutState;
        }
    }


    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void setState(State state) {
        this.state = state;
    }

    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count = count - 1;
        }
    }

    void refill(int count) {
        this.count += count;
        System.out.println("The gumball machine was just refilled; it's new count is: " + this.count);
        state.refill();
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerstate() {
        return winnerstate;
    }

    public State getState() {
        return state;
    }

    public String getLocation() {
        return location;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GumballMachine{");
        sb.append("state=").append(state);
        sb.append(", count=").append(count);
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[] args) {

        GumballMachine gumballMachine = new GumballMachine("Praha", 5);
        System.out.println(gumballMachine);
        gumballMachine.insertQuarter();
        System.out.println(gumballMachine);

        gumballMachine.turnCrank();
        System.out.println(gumballMachine);
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println(gumballMachine);

        GumballMonitor gumballMonitor = new GumballMonitor(gumballMachine);
        gumballMonitor.report();


    }

}
