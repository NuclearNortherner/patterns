package in.blagush.learn.patterns.fabric.fabricmethod.example2;

public class GreenApplesFabricImpl extends ApplesFabric {
    @Override
    Apple createApple() {
        return new GreenAppleImpl();
    }
}
