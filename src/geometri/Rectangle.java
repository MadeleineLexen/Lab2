package geometri;

import java.awt.*;

/**
 * Created by madeleine on 2016-11-18.
 */
public class Rectangle extends Shape {

    private int height;
    private int width;

    public Rectangle(int x, int y, int width, int height, Color c) throws IllegalPositionException{
        super(x, y, c);
        this.height = height;
        this.width = width;
    }
    public Rectangle(GeometricalForm f, int width, int height, Color c){
        super(f, c);
        this.height = height;
        this.width = width;
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
