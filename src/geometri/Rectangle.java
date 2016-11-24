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
        this.area = width * height;
    }

    @Override
    protected void calculatePerimeter() {
        this.perimeter = width * 2 + height * 2;
    }


    public int hashCode() {
        int sum;
        sum = getHeight() * 3 + getWidth() * 5 + getColor().hashCode();
        return sum;
    }

    @Override
    public boolean equals(Object o) {
        if(o == null){
            return false;
        }
        if(o.getClass() == this.getClass()){
            Rectangle other = (Rectangle) o;
            if(this.getWidth() == other.getWidth() && this.getHeight() == other.getHeight() ){
                return true;
            }
        }
        return false;
    }

    @Override
    public void fill(Graphics g) {
        g.fillRect(getX(), getY(), width, height);
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }
}
