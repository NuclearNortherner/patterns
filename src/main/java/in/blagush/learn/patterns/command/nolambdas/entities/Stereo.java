package in.blagush.learn.patterns.command.nolambdas.entities;

public class Stereo {
    public void on() {
        System.out.println("Stereo is on");
    }

    public void off() {
        System.out.println("Stereo is off");
    }

    public void setCD() {
        System.out.println("CD is set");
    }

    public void setVolume(int i) {
        System.out.println("Volume is " + i);
    }
}
