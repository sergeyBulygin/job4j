package ru.job4j.sbulygin.profession;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Class ProfessionTest.
 *
 * @author anonymous.
 * @version 1.0.
 * @since 19.02.19.
 */
public class ProfessionTest {
    @Test
    public void whenProfessionIsDoctorThenNameProfessionIsDoctor() {
        Profession doctor = new Doctor();
        String result = doctor.getName();
        String expected = "Doctor";
        assertThat(result, is(expected));
    }
    @Test
    public void whenProfessionIsEngineerThenNameProfessionIsEngineer() {
        Profession engineer = new Engineer();
        String result = engineer.getName();
        String expected = "Engineer";
        assertThat(result, is(expected));
    }
    @Test
    public void whenProfessionIsTeacherThenNameProfessionIsTeacher() {
        Profession teacher = new Teacher();
        String result = teacher.getName();
        String expected = "Teacher";
        assertThat(result, is(expected));
    }

}
