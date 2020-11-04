package serenitylabs.tutorials.vetclinic.domain;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.CoreMatchers.containsString;
//import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.assertThat;

public class WhenWeCreateANewDog {

//    @Test
//    public void a_new_dog_should_have_a_name_and_a_breed_and_a_colour() throws Exception {
//       // Dog fido = Dog.called("Fido").ofBreed("Labrador").andOfColour("Black");
//
//        Assert.assertEquals("Fido",fido.getName());
//        Assert.assertEquals("Labrador", fido.getBreed());
//      //  Assert.assertEquals("Black", fido.getColour());
//    }

    @Test

    public void a_dog_should_be_printed_in_a_readable_form() {
        Dog fido = Dog.called("Fido").ofBreed("Labrador").andOfColour("Black");
        assertThat(fido.toString(), is(Matchers.equalToIgnoringCase("Fido the black labrador")));
        assertThat(fido.toString(), startsWith("Fido"));
        assertThat(fido.toString(), endsWith("labrador"));
        assertThat(fido.toString(), containsString("black"));
    }
        //have ability to check collections. need to change color from String to List<String>
     @Test
     public void a_dog_can_have_several_colors(){
            Dog fido = Dog.called("Fido").ofBreed("Labrador").andOfColour("Black","white");
            assertThat(fido.getColour(),contains("Black","white"));
            assertThat(fido.getColour(),hasItem("white"));
        }

     @Test

    public void a_dog_need_to_contain_required_properties() {
        Dog fido = Dog.called("Fido").ofBreed("laborador").andOfColour("black","brown");

        assertThat(fido.toString(), startsWith(fido.getName()));
        assertThat(fido.toString(),endsWith(fido.getBreed()));
        assertThat(fido.getColour(),contains("black","brown"));
        System.out.println(fido.getColour());
    }


}
