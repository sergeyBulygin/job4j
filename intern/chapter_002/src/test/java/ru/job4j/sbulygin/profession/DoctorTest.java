package ru.job4j.sbulygin.profession;

import org.junit.Test;
import static org.hamcrest.Matchers.instanceOf;
import static org.junit.Assert.assertThat;

/**
 * Class DoctorTest.
 *
 * @author anonymous.
 * @version 1.0.
 * @since 19.02.19.
 */
public class DoctorTest {
    @Test
    public void whenDoctorHealPatientThenReturnDiagnosis() {
        Doctor therapist = new Doctor();
        assertThat(therapist.heal(), instanceOf(Diagnosis.class));
    }

}
