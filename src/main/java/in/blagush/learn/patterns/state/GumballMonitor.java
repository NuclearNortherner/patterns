package in.blagush.learn.patterns.state;

public class GumballMonitor {
    GumballMachine gumballMachine;

    public GumballMonitor(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void report() {
        System.out.println("Gumball machine: " + gumballMachine.getLocation());
        System.out.println("Gumball load: " + gumballMachine.getCount() + " gumballs");
        System.out.println("Gumball state: " + gumballMachine.getState());
    }
}
