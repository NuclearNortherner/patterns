package in.blagush.learn.patterns.prototype.interfaces;

public class TopolTreeImpl extends Tree {
    public TopolTreeImpl(int heigth) {
        super(heigth, "Topol");
    }

    @Override
    public void grow() {
        setHeigth(getHeigth() + 1);
    }

    @Override
    public Tree copy() {
        return new TopolTreeImpl(getHeigth());
    }
}
