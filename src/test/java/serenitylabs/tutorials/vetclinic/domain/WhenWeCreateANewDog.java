package serenitylabs.tutorials.vetclinic.domain;


import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class WhenWeCreateANewDog {

    //use cmd+n to bring up test generator
    @Test
    public void a_new_dog_should_have_a_name() throws Exception {

        Dog fido = Dog.called("Fido")
                      .ofBreed("Labrador")
                      .withFavoriteToy("ball")
                      .bornOn(LocalDate.of(2020,8,1));

        Assert.assertEquals("Fido", fido.getName());
        Assert.assertEquals("Labrador", fido.getBreed());
        Assert.assertEquals("ball", fido.getFavoriteToy());
        Assert.assertEquals(LocalDate.of(2020,8,1), fido.getBirthday());

    }

    @Test
    public void a_dog_can_have_an_optional_colour() throws Exception {
        Dog caduza = Dog.called("Caduza")
                      .ofBreed("Chihuahua")
                      .ofColor("black")
                      .bornOn(LocalDate.of(2019,1,20));

        Assert.assertEquals("Caduza", caduza.getName());
        Assert.assertEquals("Chihuahua", caduza.getBreed());
        Assert.assertEquals("black", caduza.getColor());
        Assert.assertEquals(LocalDate.of(2020,8,1), caduza.getBirthday());
    }
}
