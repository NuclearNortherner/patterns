package in.blagush.learn.patterns.fabric.abstractfabric.interfaces;

public abstract class TeaPack {
    private String kindOfTea;

    public TeaPack(String kindOfTea) {
        this.kindOfTea = kindOfTea;
    }

    public String getKindOfTea() {
        return kindOfTea;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TeaPack{");
        sb.append("kindOfTea='").append(kindOfTea).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
