package in.blagush.learn.patterns.singleton.classiclazysingleton;

public class GomelTrick {

    private String name = "Unique city Gomel";

    private static volatile GomelTrick gomel;   // since 1.5

    private GomelTrick() {
    }

    // двойная проверка - синзронизация только при первом вызове
    public static GomelTrick getInstance() {
        if (gomel == null) {
            synchronized (GomelTrick.class) {
                if (gomel == null) {
                    gomel = new GomelTrick();
                }
            }
        }
        return gomel;
    }

    public String getName() {
        return name;
    }
}
