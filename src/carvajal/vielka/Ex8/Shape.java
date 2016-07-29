package carvajal.vielka.Ex8;

/**
 * Created by IE on 7/28/2016.
 */
public class Shape {private String name;
    private Circle circle;
    private Triangle triangle;

    public Shape(String name, Circle circle) {
        this.name = name;
        this.circle = circle;
    }

    public Shape(String name,Triangle triangle){
        this.name = name;
        this.triangle = triangle;
    }

    public float getArea() {
        if( circle.IsUnitCircle() == true) {
            return 22 / 7 * circle.getRadius() * circle.getRadius();
        }
        else {
            return 1 / 2 * triangle.getBase() * triangle.getHeight();
        }
    }

    public float getPerimeter() {
        if( circle.IsUnitCircle() == true) {
            return 2 * 22 / 7 * circle.getRadius();
        }
        else {
            return triangle.getBase() + 2 * triangle.getSide();
        }
    }
}

