package geometri;

import java.awt.*;

/**
 * Created by hannajacobsson on 2016-11-18.
 */
public class Point extends Shape {
    private int x;
    private int y;
    private GeometricalForm f;
    private Color c;

    public Point(int x, int y, Color c) throws IllegalPositionException {
        super(x, y, c);
    }

    public Point(GeometricalForm f, Color c) {
        super(f, c);
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
