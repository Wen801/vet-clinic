package serenitylabs.tutorials.vetclinic.domain;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalTime;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class WhenVistingTheClinic {
    @Test
    public void cats_and_dogs_complain_to_the_assistant() {
        Dog fido = Dog.called("fido").ofBreed("Laborador").andOfColour("Black");
        Cat felix = Cat.called("Felix").ofBreed("Siamese").andOfColour("White");

        ComplaintRegister complaintRegister = new ComplaintRegister();
        VetAssistant assistant = new VetAssistant(complaintRegister);

        assistant.recordComplainFrom(fido);
        assistant.recordComplainFrom(felix);

        assertThat(complaintRegister.getComplaints(), hasItems("Grrrr", "Meowing"));
        System.out.println(complaintRegister.getComplaints());
    }

    @Test

    public void the_vet_should_know_when_a_pet_vaccination_is_due() {
       // Cat felix = Cat.called("Felix").ofBreed("Siamese").andOfColour("White");
        NeedsVaccinations felix = Cat.called("Felix").ofBreed("Siamese").andOfColour("White");

        LocalDate today = LocalDate.now();
        LocalDate nextYear = today.plusYears(1);

        felix.wasVaccinatedOn(today);
        assertThat(felix.nextVaccinationDue(),is(equalTo(nextYear)));
        System.out.println(felix.nextVaccinationDue());
    }

    @Test
    public void dogs_need_vaccinations_every_six_month() {
       // Dog fido = Dog.called("fido").ofBreed("Laborador").andOfColour("Black");
        NeedsVaccinations fido = Dog.called("fido").ofBreed("Laborador").andOfColour("Black");

        LocalDate today = LocalDate.now();
        LocalDate nextYear = today.plusMonths(6);

        fido.wasVaccinatedOn(today);
        assertThat(fido.nextVaccinationDue(),is(equalTo(nextYear)));
        System.out.println(fido.nextVaccinationDue());
    }

}
