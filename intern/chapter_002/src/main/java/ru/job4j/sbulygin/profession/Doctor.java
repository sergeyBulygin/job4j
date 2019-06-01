package ru.job4j.sbulygin.profession;

/**
 * Class Doctor.
 *
 * @author anonymous.
 * @version 1.0.
 * @since 19.02.19.
 */
public class Doctor extends Profession {

    public Doctor() {
        setName("Doctor");
    }

    /**
     * Method heal - heal patient.
     * @return diagnosis.
     */
    public Diagnosis heal() {
        return new Diagnosis();
    }
}
