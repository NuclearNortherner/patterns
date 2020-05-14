package in.blagush.learn.patterns.fabric.fabricmethod.example2;

public class YellowApplesFabricImpl extends ApplesFabric {
    @Override
    Apple createApple() {
        return new YellowAppleImpl();
    }
}
