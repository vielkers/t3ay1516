package reyna.deluna.Ex8;

import reyna.deluna.Ex81.*;

/**
 * Created by IE on 7/26/2016.
 */
public class Circle extends Shape {
    double radius;

    public Circle( double radius ) {
        super( "Circle" );
        this.radius = radius;
    }

    public double perimeter() {
        return 2 * 3.14 * radius;
    }

    public double area() {
        return 3.14 * radius * radius;
    }

}