package src.matthew.reyes.Exercise8;

/**
 * Created by victorreyes on 30/07/2016.
 */
public class Triangle extends Shape {
    double base;
    double height;
    double hypotenuse;

    public Triangle( double base, double height, double hypotenuse){

        super("Triangle");
        this.base = base;
        this.height = height;
        this.hypotenuse = hypotenuse;

    }
    public double area() {return 0.5 * base * height;}
    public double perimeter() {return base + height + hypotenuse;}
}
