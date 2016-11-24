package geometri;

import java.awt.*;

/**
 * Created by hannacarlsson on 2016-11-18.
 */
public class Oval extends Shape {

    private double width;
    private double height;

    public Oval(int x, int y, int width, int height, Color c) throws IllegalPositionException {
        super(x, y, c);
        this.width = width;
        this.height = height;
    }


    public Oval(GeometricalForm f, int width, int height, Color c) {
        super(f, c);
        this.width = width;
        this.height = height;
    }

    @Override
    protected void calculateArea() {
        area = Math.PI * getHeight()/2 * getWidth()/2;

    }

    @Override
    protected void calculatePerimeter() {
        perimeter = 2 * Math.PI * Math.sqrt((Math.pow(getHeight()/2, 2) + Math.pow(getWidth()/2, 2))/2);
    }

    @Override
    public int hashCode() {
        return getHeight() * 3 + getWidth() * 5 + getColor().hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (this.getClass() == o.getClass()) {
            Oval other = (Oval) o;
            if (this.getWidth() == other.getWidth() && this.getHeight() == other.getHeight() && this.getColor() == other.getColor()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void fill(Graphics g) {
        g.fillOval(getX(), getY(), getWidth(), getHeight());
    }

    @Override
    public int getWidth() {
        return (int)width;
    }

    @Override
    public int getHeight() {
        return (int)height;
    }
}
