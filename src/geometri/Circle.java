package geometri;

import java.awt.*;

/**
 * Created by hannajacobsson on 2016-11-18.
 */

public class Circle extends Shape {

    private double diameter;

    public Circle(int x, int y, int diameter, Color c) throws IllegalPositionException {
        super(x, y, c);
        this.diameter = diameter;
    }

    public Circle(GeometricalForm f, int diameter, Color c) {
        super(f, c);
    }

    public int getRadius() {
        return (int)diameter/2;
    }

    @Override
    protected void calculateArea() {

    }

    @Override
    protected void calculatePerimeter() {

    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        return false;
    }

    @Override
    public void fill(Graphics g) {

    }

    @Override
    public int getWidth() {
        return 0;
    }

    @Override
    public int getHeight() {
        return 0;
    }
}
