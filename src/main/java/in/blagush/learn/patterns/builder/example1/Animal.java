package in.blagush.learn.patterns.builder.example1;

public class Animal {

    private final String species;
    private final int age;
    private final String favoriteFood;

    public Animal(String species, int age, String favoriteFood) {
        this.species = species;
        this.age = age;
        this.favoriteFood = favoriteFood;
    }
    public String getSpecies() {
        return species;
    }
    public int getAge() {
        return age;
    }
    public String getFavoriteFood() {
        return favoriteFood;
    }

}
