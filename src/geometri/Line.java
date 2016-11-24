package geometri;
import java.awt.*;
import java.lang.Math;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

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
        this.area = 0;

    }

    @Override
    protected void calculatePerimeter() { //SKRIV
        this.perimeter = sqrt(pow(this.getHeight(),2) + pow(this.getWidth(),2));

    }

    @Override
    public int hashCode() { //TA SENARE
        return 0;
    }

    @Override
    public boolean equals(Object o) { //TA SENARE
        return false;
    }

    @Override
    public void fill(Graphics g) {

    }

    @Override
    public int getWidth() {
        int width = 0;
        if (this.getX() <= x2) {
            width = x2 - this.getX();
        }
        else if (this.getX() > x2){
            width = this.getX() - x2;
        }
        return width;
    }

    @Override
    public int getHeight() {
        int height = 0;
        if (this.getY() <= y2){
            height = y2 - this.getY();
        }
        else if (this.getY() > y2) {
            height = this.getY() - y2;
        }
        return height;
    }
}
