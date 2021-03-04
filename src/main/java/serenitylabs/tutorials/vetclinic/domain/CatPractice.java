package serenitylabs.tutorials.vetclinic.domain;

import java.time.LocalDateTime;

public class CatPractice {
    private  String name;
    private  String breed;
    private LocalDateTime birthday;

    public CatPractice(String name, String breed, LocalDateTime birthday) {
        this.name = name;
        this.breed = breed;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public LocalDateTime getBirthday() {
        return birthday;
    }

    //called is a class that create a cat builder;
    public static CatBuilder called(String name){
        return new CatBuilder(name);
    }

    public static class CatBuilder {
        private String name;
        private String breed;
        private LocalDateTime birthday;

        public CatBuilder(String name){
            this.name=name;
        }
        public CatBuilder ofBreed(String breed){
            this.breed=breed;
            return this;
        }

        public CatPractice bornOn(LocalDateTime birthday){
            this.birthday=birthday;
            return new CatPractice(name,breed,birthday);
        }

//        public Cat build(){
//            return new Cat(name,breed,birthday);
//        }
    }
}
