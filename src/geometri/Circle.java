package geometri;

import java.awt.*;

/**
 * Created by hannajacobsson on 2016-11-18.
 */

public class Circle implements GeometricalForm {

    private int diameter;

    public Circle(int x, int y, int diameter, Color c) throws IllegalPositionException {

    }

    public Circle(GeometricalForm f, int diameter, Color c) {

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getArea() {
        return 0;
    }

    @Override
    public int compareTo(GeometricalForm f) {
        return 0;
    }

    @Override
    public void fill(Graphics g) {

    }

    @Override
    public Color getColor() {
        return null;
    }

    @Override
    public int getWidth() {
        return 0;
    }

    @Override
    public int getHeight() {
        return 0;
    }

    @Override
    public int getX() {
        return 0;
    }

    @Override
    public int getY() {
        return 0;
    }

    @Override
    public void move(int dx, int dy) throws IllegalPositionException {

    }

    @Override
    public int getPerimeter() {
        return 0;
    }

    @Override
    public void place(int x, int y) throws IllegalPositionException {

    }
}
