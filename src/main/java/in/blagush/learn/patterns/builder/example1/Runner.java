package in.blagush.learn.patterns.builder.example1;

public class Runner {

    public static void main(String[] args) {

        Animal animal = new AnimalBuilder()
                .setAge(18)
                .setFavoriteFood("fish")
                .setSpecies("duck")
                .build();

        System.out.println(animal);

    }
}