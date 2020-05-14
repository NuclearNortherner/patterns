package in.blagush.learn.patterns.prototype.interfaces;

public abstract class Tree {

    private int heigth;

    private String type;

    public Tree(int heigth, String type) {
        this.heigth = heigth;
        this.type = type;
    }

    public int getHeigth() {
        return heigth;
    }

    public String getType() {
        return type;
    }

    public abstract void grow();

    public abstract Tree copy();

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "heigth=" + heigth +
                ", type='" + type + '\'' +
                '}';
    }
}
