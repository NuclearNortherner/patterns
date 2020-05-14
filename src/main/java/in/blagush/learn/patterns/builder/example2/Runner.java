package in.blagush.learn.patterns.builder.example2;

import in.blagush.learn.patterns.builder.example2.beans.HotDog;
import in.blagush.learn.patterns.builder.example2.builders.HotDogBuilderImpl;

public class Runner {
    public static void main(String[] args) {

        HotDog hotDog = new HotDogBuilderImpl()
                .addSausage()
                .addKetchup()
                .addMayonnaise()
                .addGreen()
                .build();

        System.out.println(hotDog);

    }
}
