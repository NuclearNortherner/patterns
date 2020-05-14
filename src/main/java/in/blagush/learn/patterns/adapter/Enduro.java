package in.blagush.learn.patterns.adapter;

import in.blagush.learn.patterns.adapter.interfaces.Motobike;

public class Enduro implements Motobike {
    @Override
    public void getOnto() {
        System.out.println("you sit on the bike");
    }

    @Override
    public void changeTyres() {
        System.out.println("2 wheels were changed");
    }
}
