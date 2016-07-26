package keith.lim.ex8;

/**
 * Created by kiiiiibble on 7/26/2016.
 */
public class Circle extends Shape implements Perimeter {

    double radius;
    double pi = 3.1416;

    @Override
    public double getPerimeter() {
        double perimeter = 2*pi*radius;
        return perimeter;
    }

    public Circle(float x, float y, double radius, double pi) {
        super(x, y);
        this.radius = radius;
        this.pi = pi;
    }
}
