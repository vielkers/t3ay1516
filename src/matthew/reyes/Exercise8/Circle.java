package src.matthew.reyes.Exercise8;

/**
 * Created by victorreyes on 30/07/2016.
 */
public class Circle extends Shape {
    double radius;
    public Circle( double radius) {
        super ("Circle");
        this.radius = radius;

    }
    public double perimeter (){ return radius * 3.1416 * 2;}
    public double area() {return radius * radius * 3.1416;}

}
