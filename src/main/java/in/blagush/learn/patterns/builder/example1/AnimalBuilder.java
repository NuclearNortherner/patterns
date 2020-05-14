package in.blagush.learn.patterns.builder.example1;

public class AnimalBuilder {

    private String species;
    private int age;
    private String favoriteFood;

    public AnimalBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public AnimalBuilder setSpecies(String species) {
        this.species = species;
        return this;
    }

    public AnimalBuilder setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
        return this;
    }

    public Animal build() {
        return new Animal(species,age,favoriteFood);
    }
}
