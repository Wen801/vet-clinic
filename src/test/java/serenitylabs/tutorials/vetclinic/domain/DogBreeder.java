package serenitylabs.tutorials.vetclinic.domain;

import java.time.LocalDate;

public class DogBreeder implements WithBreed,WithColour {
    private String name;
    private String breed;
    private String color;
    private String favoriteFood;
    private String favoriteToy;
    private LocalDate birthday;

    //This method will return the DogBreeder
    public static DogBreeder aDog() {
        return new DogBreeder();
    }

    public static DogBreeder aLargeDog() {
        return aDog().ofBreed("Labrador");
    }

    public static DogBreeder aSmallDog() {
        return aDog().ofBreed("Chihuahua");
    }

    public static DogBreeder aGuardDog() {
        return aDog().ofBreed("Shepherd");
    }

    public DogBreeder called(String name) {
        this.name=name;
        return this;
    }

//    public DogBreeder(String name){
//        this.name=name;
//    }

    public DogBreeder ofBreed(String breed) {
        this.breed=breed;
        return this;
    }

    public DogBreeder ofColor(String color) {
        this.color=color;
        return this;
    }

    public DogBreeder withFavoriteFood(String favoriteFood) {
        this.favoriteFood =favoriteFood;
        return this;
    }

    public DogBreeder withFavoriteToy(String favoriteToy) {
        this.favoriteToy =favoriteToy;
        return this;
    }

    public Dog bornOn(LocalDate birthday) {
        return new Dog(name, breed, birthday, favoriteToy, favoriteFood,color);
    }
}
