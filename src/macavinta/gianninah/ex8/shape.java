package macavinta.gianninah.ex8;

/**
 * Created by IE on 7/26/2016.
 */
public class shape {private String name;
    private circle circle;
    private triangle triangle;

    public shape(String name, circle circle) {
        this.name = name;
        this.circle = circle;
    }

    public shape(String name, triangle triangle) {
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
