package ysai.bravo.Ex8;

/**
 * Created by IE on 7/26/2016.
 */
public class circle extends shape {
    double radius;
    public circle(double radius) {
        super("Circle");
        this.radius=radius;
    }
    public double perimeter(){
        return 2*3.14*radius;
    }
    public double area() {
        return 3.14*radius*radius;
    }
}