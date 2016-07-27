package reyna.deluna.Ex8;

/**
 * Created by IE on 7/26/2016.
 */
public class Triangle extends Shape {
    double base;
    double height;
    double hyp;

    public Triangle(double base, double height, double hyp) {
        super( "Triangle" );
        this.base = base;
        this.height = height;
        this.hyp = hyp;
    }

    public double perimeter() {
        return base + height + hyp;
    }

    public double area() {
        return 0.5 * base * height;
    }

}
