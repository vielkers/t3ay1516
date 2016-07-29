package jason.lau.Ex8;

/**
 * Created by Jason on 7/26/2016.
 */
public class Perimeter {

    public static void printShape(Shape Shape) {

        System.out.println(Shape.name() + "'s Perimeter = " + Shape.per());
        System.out.println(Shape.name() + "'s Area = " + Shape.area() + "\n");
    }

    public static void main(String args[]) {
        Circle Jas = new Circle(0.85);
        printShape(Jas);

        Triangle Ryan = new Triangle(4.0, 2.1, 1.7);
        printShape(Ryan);
    }
}
