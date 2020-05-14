package in.blagush.learn.patterns.adapter;

import in.blagush.learn.patterns.adapter.interfaces.Car;
import in.blagush.learn.patterns.adapter.interfaces.MotoAdapter;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

        List<Car> list = new ArrayList<>();

        Hatchback hatchback = new Hatchback();
        list.add(hatchback);

        Enduro enduro = new Enduro();
        Car motoAdapter = new MotoAdapter(enduro);
        list.add(motoAdapter);

        list.forEach(System.out::println);

    }

}
