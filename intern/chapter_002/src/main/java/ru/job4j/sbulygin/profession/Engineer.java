package ru.job4j.sbulygin.profession;

/**
 * Class Engineer.
 *
 * @author anonymous.
 * @version 1.0.
 * @since 19.02.19.
 */
public class Engineer extends Profession {
    public Engineer() {
        setName("Engineer");
    }

    /**
     * Method build - build by drawing.
     * @param design design.
     * @return house.
     */
    public House build(Design design) {
        return new House();
    }
}
