package aguirre.erika.AguirreEx8;


/**
 * Created by Randolph on 30-Jul-16.
 */

public class AguirreEx8MainCircle extends AguirreEx8MainShape {
    private final double radius;
    final double pi = Math.PI;
    ;

    public AguirreEx8MainCircle() {
        this(1);
    }

    public AguirreEx8MainCircle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return pi * Math.pow(radius, 2);
    }

    public double perimeter() {
        return 2 * pi * radius;
    }
}
