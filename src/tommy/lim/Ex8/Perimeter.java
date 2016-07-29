package tommy.lim.Ex8;

/**
 * Created by IE on 7/29/2016.
 */
public class Perimeter {
    public static void printShape(Shape Shape) {

        System.out.println(Shape.word() + "'s Perimeter = " + Shape.Perimeter());
        System.out.println(Shape.word() + "'s Area = " + Shape.Area() + "\n");
    }

    public static void main(String args[]) {
        Circle circle1 = new Circle(0.75);
        printShape(circle1);

        Triangle triangle1 = new Triangle(7.8, 4.7, 2.9);
        printShape(triangle1);
    }
}
