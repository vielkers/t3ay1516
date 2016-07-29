package src.matthew.reyes.Exercise8;

/**
 * Created by victorreyes on 30/07/2016.
 */
public interface Perimeter {
    public static void printShape(Shape shape) {

        System.out.println(shape.name() + " Perimeter = " + shape.perimeter() );
        System.out.println(shape.name() + " Area = " + shape.area() );
    }
    public static void main (String args[] ){
        Circle circle = new Circle (3);
        printShape (circle);

        Triangle triangle = new Triangle (4, 3, 5);
        printShape (triangle);
    }
}
