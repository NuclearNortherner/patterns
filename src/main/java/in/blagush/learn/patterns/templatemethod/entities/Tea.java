package in.blagush.learn.patterns.templatemethod.entities;

public class Tea extends Beverage {

    private int min = 2;

    @Override
    void addIngredients() {
        System.out.println("Lemon added");
    }

    @Override
    void putMainItem() {
        System.out.println("Tea bag added");
    }

    public int getMin() {
        return min;
    }
}
