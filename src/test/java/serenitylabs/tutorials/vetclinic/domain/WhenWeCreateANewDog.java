package serenitylabs.tutorials.vetclinic.domain;


import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class WhenWeCreateANewDog {

    //use cmd+n to bring up test generator
    @Test
    public void a_new_large_dog() throws Exception {

        Dog fido = DogBreeder.aLargeDog()
                      .called("Fido")
                      .ofColor("black")
                      .withFavoriteFood("pizza")
                      .withFavoriteToy("ball")
                      .bornOn(LocalDate.of(2020,8,1));
        Assert.assertEquals("Fido", fido.getName());
        Assert.assertEquals("Labrador", fido.getBreed());
        Assert.assertEquals("ball", fido.getFavoriteToy());
        Assert.assertEquals(LocalDate.of(2020,8,1), fido.getBirthday());
        System.out.println(fido.getFavoriteFood());
    }

    @Test
    public void a_new_small_dog() throws Exception {
        Dog caduza = DogBreeder.aSmallDog()
                      .called("Caduza")
                      .ofColor("black")
                      .bornOn(LocalDate.of(2019,1,20));
        Assert.assertEquals("Caduza", caduza.getName());
        Assert.assertEquals("Chihuahua", caduza.getBreed());
        Assert.assertEquals("black", caduza.getColor());
        System.out.println(caduza.getColor());
        Assert.assertEquals(LocalDate.of(2019,1,20), caduza.getBirthday());
    }

    @Test
    public void a_new_guard_dog() throws Exception {
        Dog max = DogBreeder.aGuardDog()
                .called("Max")
                .ofColor("brown")
                .bornOn(LocalDate.of(2018,1,20));
        Assert.assertEquals("Max", max.getName());
        Assert.assertEquals("Shepherd", max.getBreed());
        Assert.assertEquals("brown", max.getColor());
        System.out.println(max.getColor());
        Assert.assertEquals(LocalDate.of(2018,1,20), max.getBirthday());
    }
}
