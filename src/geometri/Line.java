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
    private final int dx;
    private final int dy;
    private boolean angle;
    private GeometricalForm f2;

    public Line(int x1, int y1, int x2, int y2, Color c) throws IllegalPositionException {
        super(x1, y1, c);
        this.x2 = x2;
        this.y2 = y2;
        this.dx = Math.abs(getX() - x2);
        this.dy = Math.abs(getY() - y2);
        calculatePerimeter();
        calculateArea();
        setAngle();
        //getCorner();
    }

    public Line(GeometricalForm f1, GeometricalForm f2, Color c){
        super(f1, c);
        this.f2 = f2;
        this.dx = Math.abs(f1.getX() - f2.getY());
        this.dy = Math.abs(f1.getY() - f2.getY());
        calculatePerimeter();
        calculateArea();
        //getCorner();
        setAngle();
    }

    private void setAngle(){
        if(getX() < x2){
            angle = true;
        }
        else{
            angle = false;
        }
    }

    /**
     * Calculate area of Line, which is always 0
     */
    @Override
    protected void calculateArea() {
        this.area = 0;

    }

    @Override
    protected void calculatePerimeter() {
        this.perimeter = sqrt(pow(this.getHeight(),2) + pow(this.getWidth(),2));

    }

    public void getCorner(){
        int tempX = getX();
        int tempY = getY();
        setX(Math.min(getX(), x2));
        x2 = Math.max(tempX, x2);
        setY(Math.min(getY(), y2));
        y2 = Math.max(tempY, y2);
    }

    @Override
    public int hashCode() {
        int sum;
        sum = (this.getHeight() * 11 + this.getWidth() * 7 + this.getColor().hashCode());

        return sum;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null){
            return false;
        }
        if (this.getClass() == o.getClass()) {
            Line other = (Line) o;
            if (this.getWidth() == other.getWidth() && this.getHeight() == other.getHeight() && this.getColor() == other.getColor()) {
                return true;
                }
            }
        return false;
    }

    /**
     * a Line cannot be filled
     */
    @Override
    public void fill(Graphics g) {
        g.setColor( getColor() );
        if(angle){
            g.drawLine(getX(), getY(), getX()+getWidth(), getY() + getHeight());
        }
        else{
            g.drawLine(getX() + getWidth(), getY(), getX(), getY() + getHeight());
        }
    }

    @Override
    public int getWidth() {
        return dx;
    }

    @Override
    public int getHeight() {
        return dy;
    }
}
