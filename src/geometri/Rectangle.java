package geometri;

import java.awt.*;

/**
 * Created by madeleine on 2016-11-18.
 */
public class Rectangle extends Shape implements GeometricalForm {

    private int height;
    private int width;

    private Rectangle(int height, int width){
        this.height = height;
        this.width = width;
    }
    public Rectangle(int x, int y, int width, int height, Color c) throws IllegalPositionException{
        this.height = height;
        this.width = width;
    }
    public Rectangle(GeometricalForm f, int width, int height, Color c){
        this.height = height;
        this.width = width;
    }




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
