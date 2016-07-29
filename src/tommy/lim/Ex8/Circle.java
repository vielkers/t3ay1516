package tommy.lim.Ex8;

/**
 * Created by IE on 7/29/2016.
 */
public class Circle extends Shape{

    double Radius;
    public Circle(double Radius) {
        super("Circle");
        this.Radius = Radius;
    }
    public double Perimeter(){
        return 2 * 3.14 * Radius;
    }
    public double Area() {
        return 3.14 * Radius * Radius;
    }
}

