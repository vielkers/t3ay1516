package ysai.bravo.Ex8;

/**
 * Created by IE on 7/26/2016.
 */
public class perimeter {
    public static void printShape(shape Shape) {
        System.out.println(Shape.name()+"perimeter = "+Shape.perimeter());
        System.out.println(Shape.name()+"area = "+Shape.area()+ "\n");
    }
    public static void main(String args[]) {

        circle circ = new circle(0.5);
        printShape(circ);
        triangle tri = new triangle(3.5, 4.0, 2.0);
        printShape(tri);
    }
}
