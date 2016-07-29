package tommy.lim.Ex8;

/**
 * Created by IE on 7/29/2016.
 */
public class Triangle extends Shape{
    double Height;
    double Base;
    double Hypotenuse;

    public Triangle(double Height, double Base, double Hypotenuse) {
        super("Triangle");
        this.Height = Height;
        this.Base = Base;
        this.Hypotenuse = Hypotenuse;
    }
    public double Perimeter () {
        return Height + Base + Hypotenuse;
    }
    public double Area() {
        return 0.5 * Base * Height;
    }
}
