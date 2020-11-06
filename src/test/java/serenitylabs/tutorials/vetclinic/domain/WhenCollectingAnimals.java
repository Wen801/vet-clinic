package serenitylabs.tutorials.vetclinic.domain;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class WhenCollectingAnimals {
    @Test
    public void a_list_of_animals_can_contain_cats_and_dogs(){
        Dog fido = Dog.called("fido").ofBreed("Laborador").andOfColour("Black");
        Cat felix = Cat.called("Felix").ofBreed("Siamese").andOfColour("White");

        List<Animal> animals = new ArrayList<Animal>();

        animals.add(fido);
        animals.add(felix);

        assertThat(animals, hasItems(felix, fido));
    }

    @Test
    public void a_dog_complain_by_growling(){
        Dog fido = Dog.called("fido").ofBreed("Laborador").andOfColour("Black","White");
        assertThat(fido.complaint(),is(equalTo("Grrrr")));
        System.out.println(fido.getColour());
    }

    @Test
    public void a_cat_complain_by_meowing(){
        Cat felix = Cat.called("Felix").ofBreed("Siamese").andOfColour("White");
        assertThat(felix.complaint(),is(equalTo("Meowing")));
    }


}
