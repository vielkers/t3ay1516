package jason.lau.Ex8;

/**
 * Created by Jason on 7/26/2016.
 */
public class Circle extends Shape{

    double r;
    public Circle(double radius) {
        super("Circle");
        this.r = radius;
        }
    public double per(){
        return 2 * 3.14 * r;
        }
    public double area() {
        return 3.14 * r * r;
    }
}
