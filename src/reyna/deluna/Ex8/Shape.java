package reyna.deluna.Ex8;

/**
 * Created by IE on 7/26/2016.
 */
public class Shape {
    String name;

protected Shape( String name ) {
        this.name = name;
        }

public Shape() {
        this( "unspecified shape" );
        }

public String name() {
        return name;
        }

public double perimeter() {
        return 0.0;
        }

public double area() {
        return 0.0;
        }
        }