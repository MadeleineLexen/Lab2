package geometri;

import java.awt.*;

/**
 * Created by hannacarlsson on 2016-11-18.
 */
public class Oval extends Shape implements GeometricalForm {

    private double width;
    private double height;

    public Oval(int x, int y, int width, int height, Color c) throws IllegalPositionException {

    }


    public Oval(GeometricalForm f, int width, int height, Color c) {

    }


    /**
     * {@inheritDoc}
     */
    @Override
    public int getArea() {
        return 0;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int compareTo(GeometricalForm f) {
        return 0;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void fill(Graphics g) {

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Color getColor() {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getWidth() {
        return 0;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getHeight() {
        return 0;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getX() {
        return 0;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getY() {
        return 0;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void move(int dx, int dy) throws IllegalPositionException {

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getPerimeter() {
        return 0;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void place(int x, int y) throws IllegalPositionException {

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void area() {

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void perimeter() {

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setColor() {

    }
}
