package in.blagush.learn.patterns.fabric.abstractfabric.interfaces;

public abstract class TeaSpoon {
    private String style;

    public TeaSpoon(String style) {
        this.style = style;
    }

    public String getStyle() {
        return style;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TeaSpoon{");
        sb.append("style='").append(style).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
