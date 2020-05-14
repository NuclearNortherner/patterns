package in.blagush.learn.patterns.composepatterns;

import in.blagush.learn.patterns.composepatterns.duck.*;
import in.blagush.learn.patterns.composepatterns.goose.Goose;
import in.blagush.learn.patterns.composepatterns.goose.GooseAdapter;
import in.blagush.learn.patterns.composepatterns.interfaces.*;

public class Runner {
    public static void main(String[] args) {
        Runner simulator = new Runner();
        AbstractDuckFactory factory = new CountingDuckFactory();
        simulator.simulate(factory);
    }

    void simulate(AbstractDuckFactory factory) {
        Quackable mallardDuck = factory.createMallardDuck();
        Quackable redheadDuck = factory.createRedheadDuck();
        Quackable duckCall = factory.createDuckCall();
        Quackable rubberDuck = factory.createRubberDuck();
        Quackable goose = new GooseAdapter(new Goose());
        System.out.println("\nDuck Simulator");

        Flock flockOfDucks = new Flock();
        flockOfDucks.add(mallardDuck);
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(goose);

        Flock flockOfMallards = new Flock();
        flockOfMallards.add(factory.createMallardDuck());
        flockOfMallards.add(factory.createMallardDuck());
        flockOfMallards.add(factory.createMallardDuck());
        flockOfMallards.add(factory.createMallardDuck());

        flockOfDucks.add(flockOfMallards);

        System.out.println("-- All flocks");
        simulate(flockOfDucks);

        System.out.println("-- Mallards flock");
        simulate(flockOfMallards);

        System.out.println("number of quacks = " + QuackCounter.getQuacks());

        System.out.println("\nDuck Simulator: With Observer");
        Quackologist quackologist = new Quackologist();
        flockOfDucks.registerObserver(quackologist);
        simulate(flockOfDucks);
        System.out.println("\nThe ducks quacked " +
                QuackCounter.getQuacks() + " times");


    }

    void simulate(Quackable duck) {
        duck.quack();
    }

}
