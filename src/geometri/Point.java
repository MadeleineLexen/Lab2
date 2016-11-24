package geometri;

import java.awt.*;

/**
 * Created by hannajacobsson on 2016-11-18.
 */
public class Point extends Shape {
    private int x;
    private int y;
    private GeometricalForm f;
    private Color c;

    public Point(int x, int y, Color c) throws IllegalPositionException {
        super(x, y, c);
    }

    public Point(GeometricalForm f, Color c) {
        super(f, c);
    }

    /**
     * Calculate area of Point which is 0
     */
    @Override
    protected void calculateArea() {
        this.area = 0;

    }

    /**
     * Calculate perimeter of Point which is 0
     */
    @Override
    protected void calculatePerimeter() {
        this.perimeter = 0;

    }

    @Override
    public int hashCode() {
        int sum;
        sum = this.getColor().hashCode();
        return sum;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (o.getClass() == this.getClass()) {
            Point other = (Point) o;
            if (this.c == other.getColor()){
                return true;
            }
            return false;
        }
        return false;
    }

    /**
     * {@inheritDoc}
     * Point cannot be filled
     */
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
