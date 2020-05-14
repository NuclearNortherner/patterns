package in.blagush.learn.patterns.fabric.fabricmethod.example2;

public class RedApplesFabricImpl extends ApplesFabric {
    @Override
    Apple createApple() {
        return new RedAppleImpl();
    }
}
