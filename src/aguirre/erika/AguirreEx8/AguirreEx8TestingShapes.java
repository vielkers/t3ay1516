package aguirre.erika.AguirreEx8;

/**
 * Created by Randolph on 30-Jul-16.
 */
public class AguirreEx8TestingShapes {
    public static void main(String[] args) {

        // Testing the Circle
        double radius = 5;
        AguirreEx8MainShape circle = new AguirreEx8MainCircle(radius);
        System.out.println("Circle radius: " + radius
                + "\nResulting Area: " + circle.area()
                + "\nResulting Perimeter: " + circle.perimeter() + "\n");

        // Testing the Triangle
        double e = 5, j = 3, k = 4;
        AguirreEx8MainShape triangle = new AguirreEx8MainTriangle(e,j,k);
        System.out.println("Triangle sides lengths: " + e + ", " + j + ", " + k
                + "\nResulting Area: " + triangle.area()
                + "\nResulting Perimeter: " + triangle.perimeter() + "\n");
    }
}
