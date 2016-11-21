package geometri;

import java.awt.*;

/**
 * Created by madeleine on 2016-11-21.
 */
public abstract class Shape {
        public int x;
        public int y;
        public Color c;
        public double area;
        public double perimeter;
        public GeometricalForm f;

        /**
         * Calculates the area of the shape
         */
        public abstract void area();

        /**
         * Calculates the perimeter of the shape
         */
        public abstract void perimeter();

        /**
         * Sets the color of the shape
         */
        public abstract void setColor();
    }
