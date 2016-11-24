package geometri;

import java.awt.*;

/**
 * Created by madeleine on 2016-11-21.
 */
public abstract class Shape implements GeometricalForm{
    private int x;
    private int y;
    private Color c;
    protected double area;
    protected double perimeter;

    public Shape(int x, int y, Color c) {
        this.x = x;
        this.y = y;
        this.c = c;
    }

    public Shape(GeometricalForm f, Color c) {
        this.x = f.getX();
        this.y = f.getY();
        this.c = c;
    }

    /**
     * Calculates the area of the shape
     */
    protected abstract void calculateArea();

    /**
     * Calculates the perimeter of the shape
     */
    protected abstract void calculatePerimeter();

    /**
     * Sets the color of the shape
     */
    public void setColor(Color c) {
        this.c = c;
    }

    /**
     * @return generates a hashcode for the object
     */
    public abstract int hashCode();

    /**
     *
     * @return the y position
     */
    public int getY() {
        return y;
    }

    /**
     *
     * @return the x position
     */
    public int getX() {
        return x;
    }

    /**
     * @return true if the object is equal to the given object.
     */
    public abstract boolean equals(Object o);

    public void move(int dx, int dy ) throws IllegalPositionException {
        x = dx;
        y = dy;
    }

    public void place( int x, int y ) throws IllegalPositionException {
        this.x = x;
        this.y = y;
    }

    public int getArea() {
        return (int) area;
    }

    public int getPerimeter() {
        return (int) perimeter;
    }

    public Color getColor() {
        return c;
    }

    public int compareTo(GeometricalForm f) {
        if( this.getArea() > f.getArea()){
            return 1;
        }
        else if (this.getArea() < f.getArea()){
            return -1;
        }
        else{
            if( this.getPerimeter() > f.getPerimeter()){
                return 1;
            }
            else if ( this.getPerimeter() < f.getPerimeter()){
                return  -1;
            }
            else{
                return 0;
            }
        }
    }
}
