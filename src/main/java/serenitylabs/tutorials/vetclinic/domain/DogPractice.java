package serenitylabs.tutorials.vetclinic.domain;

import java.time.LocalDateTime;

public class DogPractice {

    private final String name;
    private final String breed;
    private final LocalDateTime birthday;
    private String favoriteFood;

    public DogPractice(String name, String breed, LocalDateTime birthday) {
        this.name = name;
        this.breed=breed;
        this.birthday=birthday;
      //  this.favoriteFood=null;
    }

    public DogPractice(String name, String breed, LocalDateTime birthday, String favoriteFood) {
        this(name,breed,birthday);
        this.favoriteFood=favoriteFood;

    }

//    public void setName(String name) {
//        this.name=name;
//    }

    public String getName() {
        return name;
    }
//
//    public void setBreed(String breed) {
//        this.breed=breed;
//    }


    public String getBreed() {
        return breed;
    }

//    public void setDateOfBirth(LocalDateTime birthday) {
//        this.birthday=birthday;
//    }

    public LocalDateTime getDateOfBirth() {
        return birthday;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }
}
