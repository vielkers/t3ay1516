package src.matthew.reyes.Exercise8;

/**
 * Created by victorreyes on 30/07/2016.
 */
public class Shape {
    String name;
    protected Shape(String name) {this.name = name;}
    public Shape() {this("Shape not Specified");}
    public String name() {return name;}
    public double perimeter() {return 0.0;}
    public double area() {return 0.0;}

}
