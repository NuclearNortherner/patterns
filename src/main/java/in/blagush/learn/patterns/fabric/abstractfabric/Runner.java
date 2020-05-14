package in.blagush.learn.patterns.fabric.abstractfabric;

import in.blagush.learn.patterns.fabric.abstractfabric.factories.IndianFactoryImpl;
import in.blagush.learn.patterns.fabric.abstractfabric.interfaces.Factory;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        Factory factory = new IndianFactoryImpl();

        List<Object> list = new ArrayList<>();
        list.add(factory.createTeaCup());
        list.add(factory.createTeaPack());
        list.add(factory.createTeaSpoon());

        list.forEach(System.out::println);


    }


}
