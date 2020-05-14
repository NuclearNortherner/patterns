package in.blagush.learn.patterns.singleton.classiceagersingleton;

public class Runner {

    public static void main(String[] args) {
        Gomel gomel = Gomel.getInstance();
        System.out.println(gomel);
        gomel = Gomel.getInstance();
        System.out.println(gomel);
    }


}
