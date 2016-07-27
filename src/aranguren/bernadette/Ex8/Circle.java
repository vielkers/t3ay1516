package aranguren.bernadette.Ex8;

public class Circle extends Shape implements Perimeter {

    private double radius;

    public Circle (double circRadius) {
        shapeName = "Circle";
        radius = circRadius;
    }

    public double computePerimeter() {
        return perimeter = 2 * Math.PI * radius;
    }

}