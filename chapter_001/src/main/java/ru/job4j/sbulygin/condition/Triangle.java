package ru.job4j.sbulygin.condition;


/**
 * Class Triangle.
 * @author sbulygin.
 * @since 01.12.2018.
 * @version 1.0.
 */
public class Triangle {

    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * The method of calculating the semi-perimeter lengths of the parties.
     * Formula. (ab + ac + bc) / 2.
     * @param ab distance between points a b.
     * @param ac distance between points a b.
     * @param bc distance between points a b.
     * @return semi-perimeter.
     */
    public double period(double ab, double ac, double bc) {
        return (ab + ac + bc) / 2;
    }

    /**
     * The method must calculate the area of the triangle.
     * @return Return space if a triangle exists or -1 if there is no triangle.
     */
    public double area() {
        double result = -1;
        double ab = this.a.distance(this.b);
        double ac = this.a.distance(this.c);
        double bc = this.b.distance(this.c);
        double p = this.period(ab, ac, bc);
        if (this.exist(ab, ac, bc)) {
            result = Math.sqrt(p * (p - ab) * (p - ac) * (p - bc));
        }
        return result;
    }

    /**
     * Метод проверяет можно ли построить треугольник с такими длинами сторон.
     * @param ab distance between points a b.
     * @param ac distance between points a b.
     * @param bc distance between points a b.
     * @return boolean result.
     */
    private boolean exist(double ab, double ac, double bc) {
        return (ab > 0 && ac > 0 && bc > 0 && ((ab + ac) != bc) && ((ac + bc) != ab) && ((ab + bc) != ac));
    }

}
