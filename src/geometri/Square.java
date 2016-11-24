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
        this.area = side * side;
    }


    @Override
    protected void calculatePerimeter() {
        this.perimeter = side * 4;
    }


    @Override
    public int hashCode() {
        int sum;
        sum = side * 3 + getColor().hashCode() * 5;
        return sum;
    }


    @Override
    public boolean equals(Object o) {
        if( o == null){
            return false;
        }
        if(o.getClass() == this.getClass()){
            Square other = (Square) o;
            if(this.getWidth() == other.getWidth() && this.getHeight() == other.getHeight() ){
                return true;
            }
        }
        return false;
    }

    @Override
    public void fill(Graphics g) {
        g.fillRect(getX(), getY(), getWidth(),getHeight());
    }

    /**
     * {@inheritDoc}
     * returns the width of the square, which is the same as its side
     * @return
     */
    @Override
    public int getWidth() {
        return side;
    }

    /**
     * {@inheritDoc}
     * returns the height for the square, which is the same as the side.
     * @return
     */
    @Override
    public int getHeight() {
        return side;
    }
}
