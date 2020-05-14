package in.blagush.learn.patterns.adapter.interfaces;

public class MotoAdapter implements Car {
    Motobike motobike;

    public MotoAdapter(Motobike motobike) {
        this.motobike = motobike;
    }

    @Override
    public void getInto() {
        motobike.getOnto();
    }

    @Override
    public void changeTyres() {
        motobike.changeTyres();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MotoAdapter{");
        sb.append("motobike=").append(motobike);
        sb.append('}');
        return sb.toString();
    }
}
