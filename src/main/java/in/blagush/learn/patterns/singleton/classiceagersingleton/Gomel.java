package in.blagush.learn.patterns.singleton.classiceagersingleton;

public class Gomel {

    private String name = "Unique city Gomel";

    private static Gomel gomel = new Gomel();

    private Gomel() {
    }

    // убираем проблему многопоточности (но это может быть накладно, если критично - лучше статическая инициализация)
    public static Gomel getInstance() {
        return gomel;
    }

    public String getName() {
        return name;
    }
}
