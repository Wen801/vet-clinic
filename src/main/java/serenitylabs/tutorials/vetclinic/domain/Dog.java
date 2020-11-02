package serenitylabs.tutorials.vetclinic.domain;

import java.security.cert.CertPathBuilder;
import java.time.LocalDateTime;

public class Dog {

    private final String name;
    private final String breed;
    private final LocalDateTime dateOfBirth;

    public Dog(String name, String breed, LocalDateTime dateOfBirth) {
        this.name = name;
        this.breed = breed;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }


    public String getBreed() {
        return breed;
    }

    public LocalDateTime getDateOfBirth() {
        return dateOfBirth;
    }

    //dog called creates the dog builder;
    public static DogBuilder called(String name) {
        return new DogBuilder(name);
    }

    public static class DogBuilder {
        private String name;
        private String breed;
        private LocalDateTime birthday;

        public DogBuilder (String name){
            this.name = name;
        }
        public DogBuilder ofBreed(String breed) {
            this.breed = breed;
            return this;
        }

        public Dog bornOn(LocalDateTime birthday) {
            return new Dog(name, breed, birthday);
        }
    }
}
