package serenitylabs.tutorials.vetclinic.domain;


import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDateTime;

//import static org.hamcrest.MatcherAssert.assertThat;

public class WhenCreatingANewDogPracticePractice {

    @Test
    public void dogShouldHaveAName () throws Exception {
        LocalDateTime birthday = LocalDateTime.now();
        DogPractice fido = new DogPractice("Fido","Poodle",birthday);

        Assert.assertEquals("Poodle", fido.getBreed());
        Assert.assertEquals("Fido", fido.getName());
        Assert.assertEquals(birthday,fido.getDateOfBirth());
    }

    @Test
    public void itShouldHaveAnOptionalFavoriteFood() throws Exception{
        LocalDateTime birthday = LocalDateTime.now();
        DogPractice fido = new DogPractice("Fido","Poodle",birthday,"pizza");
        Assert.assertEquals("pizza",fido.getFavoriteFood());
    }

    @Test
    public void catShouldHaveAName () throws Exception {
        LocalDateTime birthday = LocalDateTime.now();
        CatPractice lucy = CatPractice.called("Lucy").ofBreed("Persian").bornOn(birthday);


        Assert.assertEquals("Persian", lucy.getBreed());
        Assert.assertEquals("Lucy", lucy.getName());
        Assert.assertEquals(birthday,lucy.getBirthday());

   
    }

}
