package serenitylabs.tutorials.vetclinic.domain;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDateTime;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class WhenWeBookAnAppointment {

    private static final LocalDateTime TODAY_AT_2_PM = LocalDateTime.now().withHour(2).withMinute(0);

    @Test
    public void an_appointment_has_a_patient_name_an_owner_and_a_date() {
        Appointment appointment = Appointment.forPetCalled("Fido").ownedBy("Fred").at(TODAY_AT_2_PM);

//        Assert.assertEquals("Fido",appointment.getPetName());
//        Assert.assertEquals("Fred",appointment.getOwner());
//        Assert.assertEquals(TODAY_AT_2_PM,appointment.getAppointmentTime());

        assertThat("Fido",equalTo(appointment.getPetName()));
        assertThat("Fred",equalTo(appointment.getOwner()));
        assertThat(TODAY_AT_2_PM, equalTo(appointment.getAppointmentTime()));
    }

    @Test
    public void an_appointment_can_have_an_optional_reason() {
        Appointment appointment = Appointment.forPetCalled("Fido").ownedBy("Fred").because("He is sick").at(TODAY_AT_2_PM);

//        Assert.assertEquals(true,appointment.getReason().isPresent());
//        Assert.assertEquals("He is sick",appointment.getReason().get());

        assertThat(true, equalTo(appointment.getReason().isPresent()));
        assertThat("He is sick", equalTo(appointment.getReason().get()));
    }

    public void an_appointment_can_be_checked_in_different_methods(){

        Appointment appointment = Appointment.forPetCalled("Fido").ownedBy("Fred").at(TODAY_AT_2_PM);

      //  assertThat();

    }



}
