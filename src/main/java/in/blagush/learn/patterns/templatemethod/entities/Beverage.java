package in.blagush.learn.patterns.templatemethod.entities;

public abstract class Beverage {

    public final void prepareBeverage() {
        boilWater();
        getCup();
        putMainItem();
        addIngredients();
        waitMinutes();
        hook();
    }

    private void hook() {
        //hook method
    }

    private void waitMinutes() {
        System.out.println("Waited " + getMin() + " minutes");
    }

    abstract void addIngredients();

    abstract void putMainItem();

    private void getCup() {
        System.out.println("Cup get");
    }

    private void boilWater() {
        System.out.println("Water boiled");
    }

    abstract int getMin();

}
