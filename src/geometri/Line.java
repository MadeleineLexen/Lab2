package geometri;
import java.awt.*;
import java.lang.Math;

/**
 * Created by madeleine on 2016-11-18.
 */
public class Line extends Shape {

    private int x2;
    private int y2;
    private GeometricalForm f2;

    public Line(int x1, int y1, int x2, int y2, Color c) throws IllegalPositionException {
        super(x1, y1, c);
        this.x2 = x2;
        this.y2 = y2;
    }

    public Line(GeometricalForm f1, GeometricalForm f2, Color c){
        super(f1, c);
        this.f2 = f2;

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
