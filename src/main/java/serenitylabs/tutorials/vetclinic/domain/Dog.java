package serenitylabs.tutorials.vetclinic.domain;

import java.time.LocalDate;

public class Dog {

    private String name;
    private String breed;
    private String favoriteToy;
    private String favoriteFood;
    private String color;
    private LocalDate birthday;

    public Dog(String name, String breed, LocalDate birthday, String favoriteToy, String favoriteFood,String color) {
        this.name = name;
        this.breed = breed;
        this.birthday = birthday;
        this.favoriteToy=favoriteToy;
        this.color=color;
        this.favoriteFood = favoriteFood;
    }

    public String getBreed() {
        return breed;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public String getName() {
        return name;
    }

    public String getFavoriteToy() {
        return favoriteToy;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public String getColor() {
        return color;
    }


}
