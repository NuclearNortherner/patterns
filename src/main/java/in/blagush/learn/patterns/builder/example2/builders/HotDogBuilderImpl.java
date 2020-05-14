package in.blagush.learn.patterns.builder.example2.builders;

import in.blagush.learn.patterns.builder.example2.beans.HotDog;

public class HotDogBuilderImpl {

    private String sausage;
    private String mayonnaise;
    private String ketchUp;
    private String green;

    public HotDogBuilderImpl reset() {
        sausage = null;
        mayonnaise = null;
        ketchUp = null;
        green = null;
        return this;
    }

    public HotDogBuilderImpl addMayonnaise() {
        mayonnaise = "mayonnaise";
        return this;
    }

    public HotDogBuilderImpl addSausage() {
        sausage = "sausage";
        return this;
    }

    public HotDogBuilderImpl addKetchup() {
        ketchUp = "ketchUp";
        return this;
    }

    public HotDogBuilderImpl addGreen() {
        green = "green";
        return this;
    }

    public HotDog build(){
        return new HotDog(sausage, mayonnaise, ketchUp, green);
    }
}
