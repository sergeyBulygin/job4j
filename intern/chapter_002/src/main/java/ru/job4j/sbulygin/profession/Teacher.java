package ru.job4j.sbulygin.profession;

/**
 * Class Teacher.
 *
 * @author anonymous.
 * @version 1.0.
 * @since 19.02.19.
 */
public class Teacher extends Profession {

    public Teacher() {
        setName("Teacher");
    }

    /**
     * Method teach - teach student.
     * @param student student.
     * @return lore.
     */
    public Lore teach(Student student) {
        return new Lore();
    }
}
