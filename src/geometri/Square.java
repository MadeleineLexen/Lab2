package geometri;

import com.sun.xml.internal.ws.encoding.SwACodec;

import java.awt.*;

/**
 * Created by madeleine on 2016-11-18.
 */
public class Square extends Shape{
    private int side;

    public Square(int x, int y, int side, Color c) throws IllegalPositionException{
        super(x, y, c);
        this.side = side;

    }
    public Square(GeometricalForm f, int side, Color c){
        super(f, c);
        this.side = side;
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
