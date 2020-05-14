package in.blagush.learn.patterns.templatemethod.entities;

public class Cacao extends Beverage {

    private int min = 4;

    @Override
    void addIngredients() {
        // no need to add ingredients
    }

    @Override
    void putMainItem() {
        System.out.println("Cacao added");
    }

    public int getMin() {
        return min;
    }
}
