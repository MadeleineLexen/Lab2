package geometri;

import com.sun.xml.internal.ws.encoding.SwACodec;

import java.awt.*;

/**
 * Created by madeleine on 2016-11-18.
 */
public class Square extends Shape implements GeometricalForm{
    private int side;

    public Square(int x, int y, int side, Color c) throws IllegalPositionException{
        this.side = side;
    }
    public Square(GeometricalForm f, int side, Color c){
        this.side = side;
    }


    /**
     * {@inheritDoc}
     *
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
        return 0;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void fill(Graphics g) {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Color getColor() {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getWidth() {
        return 0;
    }

    /**
     * {@inheritDoc}
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
        return 0;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getY() {
        return 0;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void move(int dx, int dy) throws IllegalPositionException {

    }

    /**
     * {@inheritDoc}
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
