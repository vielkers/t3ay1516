package aguirre.erika.AguirreEx8;

/**
 * Created by Randolph on 30-Jul-16.
 */
public class AguirreEx8MainTriangle extends AguirreEx8MainShape {
    private final double e, j, k;

    public AguirreEx8MainTriangle() {
    this(1,1,1);
}
    public AguirreEx8MainTriangle(double e, double j, double k) {
        this.e = e;
        this.j = j;
        this.k = k;
    }

    public double area() {
        double s = (e + j + k) / 2;
        return Math.sqrt(s *(s - e) * (s - j) * (s - k));
    }

    public double perimeter() {
        return e + j + k;
    }
}
