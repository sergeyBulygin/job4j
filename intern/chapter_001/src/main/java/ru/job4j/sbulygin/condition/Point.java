package ru.job4j.sbulygin.condition;

/**
 * Class Point.
 * @author sbulygin.
 * @since 02.08.2018.
 * @version 1.0.
 */
public class Point {

    /**
     * Сoordinate x field.
     */
    private int x;

    /**
     * Сoordinate y field.
     */
    private int y;
    /**
     *  Сoordinate z field.
     */
    private int z;

    /**
     * Class Point constructor.
     * @param x coordinate x.
     * @param y coordinate y.
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Class Point constructor for 3d.
     * @param x coordinate x.
     * @param y coordinate y.
     * @param z coordinate z.
     */
    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * The method calculates the distance between two points
     * @param that second point.
     * @return result.
     */
    public double distance(Point that) {
        return Math.sqrt(Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2));
    }
    /**
     * The method calculates the distance between three points
     * @param that second point.
     * @return result.
     */
    public double distanceThreePoint(Point that) {
        return Math.sqrt(Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2) + Math.pow(this.z - that.z, 2));
    }
}
