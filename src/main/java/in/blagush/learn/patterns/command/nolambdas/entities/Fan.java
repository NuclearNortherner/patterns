package in.blagush.learn.patterns.command.nolambdas.entities;

public class Fan  {

    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;

    int speed;

    public Fan() {
    }

    public void setHigh() {
        speed = HIGH;
    }

    public void setMedium() {
        speed = MEDIUM;
    }

    public void setLow() {
        speed = LOW;
    }

    public void setOff() {
        speed = OFF;
    }

    public int getSpeed() {
        return speed;
    }



}
