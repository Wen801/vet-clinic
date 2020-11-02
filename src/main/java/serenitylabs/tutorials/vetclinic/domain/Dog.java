package serenitylabs.tutorials.vetclinic.domain;

import java.time.LocalDate;

public class Dog {

    private String name;
    private String breed;
    LocalDate birthday;
    private String favoriteToy;
    private String color;

    private Dog(String name, String breed, LocalDate birthday, String favoriteToy, String color) {
        this.name = name;
        this.breed = breed;
        this.birthday = birthday;
        this.favoriteToy=favoriteToy;
        this.color=color;
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

    public String getColor() {
        return color;
    }


//    interface WithBreed{
//        withFavoriteToy ofBreed(String breed);
//    }
//
//    interface withFavoriteToy{
//        DogBreeder withFavoriteToy(String favoriteToy);
//    }

    //mandatory field in builder should use interface to let user know.
    interface WithBreed{
        DogBreeder ofBreed(String breed);
    }

    public static WithBreed called(String name) {
        return new DogBreeder(name);
    }

    public static class DogBreeder implements WithBreed {
        private String name;
        private String breed;
        private LocalDate birthday;
        private String favoriteToy;
        private String color;

        public DogBreeder(String name){
            this.name=name;
        }

        public DogBreeder ofBreed(String breed) {
            this.breed=breed;
            return this;
        }
        public Dog bornOn(LocalDate birthday) {
            return new Dog(name, breed, birthday,favoriteToy,color);
        }

        public DogBreeder withFavoriteToy(String favoriteToy) {
            this.favoriteToy =favoriteToy;
            return this;
        }

        public DogBreeder ofColor(String color) {
            this.color=color;
            return this;
        }
    }
}
