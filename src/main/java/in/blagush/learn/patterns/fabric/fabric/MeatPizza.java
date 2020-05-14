package in.blagush.learn.patterns.fabric.fabric;

public class MeatPizza implements Pizza {

    private String name = "Meat pizza";

    @Override
    public void prepare() {
        System.out.println(name + " is prepared");
    }

    @Override
    public void bake() {
        System.out.println(name + " is baked");
    }

    @Override
    public void cut() {
        System.out.println(name + " is cutted");
    }

    @Override
    public void box() {
        System.out.println(name + " is boxed");
    }
}
