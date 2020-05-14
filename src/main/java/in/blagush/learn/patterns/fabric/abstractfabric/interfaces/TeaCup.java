package in.blagush.learn.patterns.fabric.abstractfabric.interfaces;

public abstract class TeaCup {
    private int capacity;
    private String style;

    public TeaCup(int capacity, String style) {
        this.capacity = capacity;
        this.style = style;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getStyle() {
        return style;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TeaCup{");
        sb.append("capacity=").append(capacity);
        sb.append(", style='").append(style).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
