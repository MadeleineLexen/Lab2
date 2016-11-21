package geometri;

import com.sun.xml.internal.ws.encoding.SwACodec;

import java.awt.*;

/**
 * Created by madeleine on 2016-11-18.
 */
public class Square implements GeometricalForm {
    private int side;

    private Square(int length){
        this.side = side;
    }

    public Square(int x, int y, int side, Color c) throws IllegalPositionException{
        this.side = side;
    }
    public Square(GeometricalForm f, int side, Color c){
        this.side = side;
    }


    /**
     * {@inheritDoc}
     * @return
     */

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
