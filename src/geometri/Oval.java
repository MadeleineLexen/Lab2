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
