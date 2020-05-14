package in.blagush.learn.patterns.prototype.interfaces;

public class YasenTreeImpl extends Tree {
    public YasenTreeImpl(int heigth) {
        super(heigth, "Yasen");
    }

    @Override
    public void grow() {
        setHeigth(getHeigth() + 2);
    }

    @Override
    public Tree copy() {
        return new YasenTreeImpl(getHeigth());
    }
}
