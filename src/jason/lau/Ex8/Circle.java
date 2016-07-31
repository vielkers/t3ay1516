package jason.lau.Ex8;

/**
 * Created by Jason on 7/26/2016.
 */
public class Circle extends Shape implements Perimeter{

    double r;
    double pi = 3.1416;

    @Override
    public double getPerimeter() {
        double p = 2*pi*r;
        return p;
    }

    public Circle(float x, float y, double radius, double pi) {
        super(x, y);
        this.r = radius;
        this.pi = pi;
        }
}
