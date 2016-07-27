package reyna.deluna.Ex8;

/**
 * Created by IE on 7/26/2016.
 */
public interface Perimeter {
    public static void printShape(Shape shape) {
        System.out.println(  shape.name() + " perimeter = " + shape.perimeter()  );
        System.out.println(  shape.name() + " area = " + shape.area() + "\n" );
    }

    public static void main( String args[] ) {

        Circle circ = new Circle( 0.5 );
        printShape( circ );

        Triangle tri = new Triangle( 3.5, 4.0, 2.0 );
        printShape( tri );
    }
}
