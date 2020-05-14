package in.blagush.learn.patterns.templatemethod.entities;

public class Coffee extends Beverage {

    private int min = 5;

    @Override
    void addIngredients() {
        System.out.println("Milk added");
    }

    @Override
    void putMainItem() {
        System.out.println("Coffee added");
    }

    public int getMin() {
        return min;
    }
}
