package ysai.bravo.Ex8;

/**
 * Created by IE on 7/26/2016.
 */
public class triangle extends shape {
    double height;
    double base;
    double hypotenuse;

    public triangle(double height, double base, double hypotenuse) {
        super("Triangle");
        this.height=height;
        this.base=base;
        this.hypotenuse=hypotenuse;
    }
    public double perimeter () {
        return height+base+hypotenuse;
    }
    public double area() {
        return 0.5*base*height;
    }
}