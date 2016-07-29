package jason.lau.Ex8;

/**
 * Created by Jason on 7/26/2016.
 */
public class Triangle extends Shape {
    double h;
    double b;
    double hypo;

    public Triangle(double height, double base, double hypotenuse) {
        super("Triangle");
        this.h = height;
        this.b = base;
        this.hypo = hypotenuse;
        }
    public double per () {
        return h + b + hypo;
        }
    public double area() {
        return 0.5 * b * h;
        }
}
