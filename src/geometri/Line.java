package geometri;
import java.awt.*;
import java.lang.Math;

/**
 * Created by madeleine on 2016-11-18.
 */
public class Line implements GeometricalForm {

    private int x2;
    private int y2;
    //private double x;
    //private double y;
    //private GeometricalForm f1;
    private GeometricalForm f2;
    //private Color c;

    public Line(int x1, int y1, int x2, int y2, Color c) throws IllegalPositionException {
        this.x = x1;
        this.x2 = x2;
        this.y = y1;
        this.y2 = y2;
        this.c = c;
    }
    public Line(GeometricalForm f1, GeometricalForm f2, Color c){
        this.f = f1;
        this.f2 = f2;
        this.c = c;
    }

    /**
     * Get the area of a line which is always 0.
     *
     * @return the area of a line (0)
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
            if (f.getPerimeter() < getPerimeter()){
                return -1;
            }
            else if (f.getPerimeter() == getPerimeter()) {
                return 0;
            }
            else {return 1;}
        }
        else {return -1;}
    }

    /**
     * A line cannot be filled
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
     * {@inheritDoc}
     */
    @Override
    public int getWidth() {
        if (x <= x2) {return x2-x;}
        else {return x-x2;}
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getHeight() {
        if (y <= y2) {return y2-y;}
        else {return y-y2;}
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getX() {
        if (x <= x2) {return x;}
        else {return x2;}
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getY() {
        if (y1 <= y2) {return y1;}
        else {return y2;}
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void move(int dx, int dy) throws IllegalPositionException {
        int newX = x + dx;
        int newY = y + dy;
        if (newX < 0 || newY < 0) throw new IllegalPositionException("Illegal position");
        x = newX;
        y = newY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getPerimeter() {
        if (x < x2) {dx = x2-x;}
        else if (x > x2) {dx = x-x2;}
        if (y < y2) {dy = y2-y;}
        else if(y > y2) {dy = y-y2;}

        return (int) (Math.sqrt((Math.pow(dx,2))+(Math.pow(dy,2))));
    }

    /**
     *{@inheritDoc}
     */
    @Override
    public void place(int x, int y) throws IllegalPositionException {
        if (x < 0 || y <0) { throw new IllegalPositionException("Illegal position");}
        this.x = x;
        this.y = y;

    }
}
