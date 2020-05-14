package in.blagush.learn.patterns.prototype;

import in.blagush.learn.patterns.prototype.interfaces.Tree;
import in.blagush.learn.patterns.prototype.interfaces.YasenTreeImpl;
import org.junit.jupiter.api.Assertions;

public class Runner {
    public static void main(String[] args) {

        Tree yasen = new YasenTreeImpl(1);
        yasen.grow();

        Tree yasen2 = yasen.copy();
        yasen2.grow();

        System.out.println(yasen2);

        Assertions.assertEquals(yasen.getHeigth(), yasen2.getHeigth());

    }
}
