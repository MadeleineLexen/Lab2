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

    /**
     *
     * @return the radius of the circle as an int
     */
    public int getRadius() {
        return (int)diameter/2;
    }

    /**
     *
     * @return the diameter of the circle as an int
     */
    public int getDiameter() {
        return (int)diameter;
    }

    @Override
    protected void calculateArea() {
        area = Math.PI * Math.pow(getRadius(), 2);
    }

    @Override
    protected void calculatePerimeter() {
        perimeter = 2 * Math.PI * getRadius();
    }

    @Override
    public int hashCode() {
        return getDiameter() * 3 + getColor().hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (o.getClass() == this.getClass()) {
            Circle other = (Circle) o;
            if (this.getColor() == other.getColor() && this.getDiameter() == other.getDiameter()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void fill(Graphics g) {
        g.fillOval(getX(), getY(), getWidth(), getHeight());
    }

    /**
     * {@inheritDoc}
     * @return the width of the circle which equals the diameter since it's a circle
     */
    @Override
    public int getWidth() {
        return (int)diameter;
    }

    /**
     * {@inheritDoc}
     * @return the height of the circle which equals the diameter since it's a circle
     */
    @Override
    public int getHeight() {
        return (int)diameter;
    }
}
