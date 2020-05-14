package in.blagush.learn.patterns.fabric.abstractmethod;

import in.blagush.learn.patterns.fabric.abstractmethod.ingredients.*;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Pizza {

    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;
    ArrayList<String> toppings = new ArrayList<String>();

    abstract void prepare();

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }
    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }
    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pizza{");
        sb.append("name='").append(name).append('\'');
        sb.append(", dough='").append(dough).append('\'');
        sb.append(", sauce='").append(sauce).append('\'');
        sb.append(", veggies=").append(Arrays.toString(veggies));
        sb.append(", cheese=").append(cheese);
        sb.append(", pepperoni=").append(pepperoni);
        sb.append(", clam=").append(clam);
        sb.append(", toppings=").append(toppings);
        sb.append('}');
        return sb.toString();
    }

}
