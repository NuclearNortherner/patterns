package in.blagush.learn.patterns.singleton.classiclazysingleton;

public class Gomel {

    private String name = "Unique city Gomel";

    private static Gomel gomel;

    private Gomel() {
    }

    // убираем проблему многопоточности (но это может быть накладно, если критично - лучше статическая инициализация)
    public static synchronized Gomel getInstance() {
        if (gomel == null) {
            gomel = new Gomel();
        }
        return gomel;
    }

    public String getName() {
        return name;
    }
}
