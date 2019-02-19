package ru.job4j.sbulygin.profession;

import org.junit.Test;
import static org.hamcrest.Matchers.instanceOf;
import static org.junit.Assert.assertThat;

/**
 * Class TeacherTest.
 *
 * @author anonymous.
 * @version 1.0.
 * @since 19.02.19.
 */
public class TeacherTest {
    @Test
    public void whenDoctorHealPatientThenReturnDiagnosis() {
        Teacher professor = new Teacher();
        Student disciple = new Student();
        assertThat(professor.teach(disciple), instanceOf(Lore.class));
    }
}
