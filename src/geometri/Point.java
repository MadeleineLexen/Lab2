package geometri;

import java.awt.*;

/**
 * Created by hannajacobsson on 2016-11-18.
 */
public class Point extends Shape implements GeometricalForm {

    public Point(int x, int y, Color c) throws IllegalPositionException {
        this.x = x;
        this.y = y;
    }

    public Point(GeometricalForm f, Color c) {
        this.f = f;
        this.c = c;
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
        if (f.getArea() == getArea()) {
            if (f.getPerimeter() == getPerimeter()) {
                return 0;
            } else {
                return -1;
            }
        } else {
            return -1;
        }
    }

    /**
     * Point cannot be filled
     */
    @Override
    public void fill(Graphics g) {
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Color getColor() {
        return c;
    }

    /**
     * Point has no width
     */
    @Override
    public int getWidth() {
        return 0;
    }

    /**
     * Point has no height
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
        return x;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getY() {
        return y;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void move(int dx, int dy) throws IllegalPositionException {
        int newX = x + dx;
        int newY = y + dy;
        if (newX < 0 || newY < 0) { throw new IllegalPositionException("Illegal position");}
        x = newX;
        y = newY;
    }

    /**
     * Point has no perimeter
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
        if (x < 0 || y < 0) { throw new IllegalPositionException("Illegal position");}
        this.x = x;
        this.y= y;

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
