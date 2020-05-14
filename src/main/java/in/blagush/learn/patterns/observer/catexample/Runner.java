package in.blagush.learn.patterns.observer.catexample;

public class Runner {

    public static void main(String[] args) {
        CatOwner catOwner = new CatOwner();
        Dima dima = new Dima(catOwner);
        Alina alina = new Alina(catOwner);
        Mom mom = new Mom(catOwner);

        catOwner.setNewPost("look at my fatty cat ^_^");

        dima.unsubscribe();

        catOwner.setNewPost("cat is sleeping T.T");

        dima.subscribe(catOwner);

        catOwner.setNewPost("Just look at this cute cat in a hat");

    }

}
