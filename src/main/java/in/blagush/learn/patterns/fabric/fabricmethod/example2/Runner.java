package in.blagush.learn.patterns.fabric.fabricmethod.example2;

public class Runner {
    public static void main(String[] args) {

        ApplesFabric fabric = new YellowApplesFabricImpl();

        Apple apple = fabric.createApple();

        System.out.println(apple.getColor());

    }
}
