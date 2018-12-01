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
     * Class Point constructor.
     * @param x coordinate x.
     * @param y coordinate y.
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * The method calculates the distance between two points
     * @param that second point.
     * @return result.
     */
    public double distance(Point that) {
        return Math.sqrt(Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2));
    }
}
