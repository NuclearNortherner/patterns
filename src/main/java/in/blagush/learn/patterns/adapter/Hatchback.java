package in.blagush.learn.patterns.adapter;

import in.blagush.learn.patterns.adapter.interfaces.Car;

public class Hatchback implements Car {
    @Override
    public void getInto() {
        System.out.println("you opened the door and sit");
    }

    @Override
    public void changeTyres() {
        System.out.println("4 wheels ware changed");
    }
}
