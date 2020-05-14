package in.blagush.learn.patterns.builder.example2.beans;

public class HotDog {
    private final String sausage;
    private final String mayonnaise;
    private final String ketchUp;
    private final String green;

    public HotDog(String sausage, String mayonnaise, String ketchUp, String green) {
        this.sausage = sausage;
        this.mayonnaise = mayonnaise;
        this.ketchUp = ketchUp;
        this.green = green;
    }

    public String getSausage() {
        return sausage;
    }

    public String getMayonnaise() {
        return mayonnaise;
    }

    public String getKetchUp() {
        return ketchUp;
    }

    public String getGreen() {
        return green;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("HotDog{");
        sb.append("sausage='").append(sausage).append('\'');
        sb.append(", mayonnaise='").append(mayonnaise).append('\'');
        sb.append(", ketchUp='").append(ketchUp).append('\'');
        sb.append(", green='").append(green).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
