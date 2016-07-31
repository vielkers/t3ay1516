package joshua.juanson.FinalVersionsExercises.Exercise8;
public class Circle extends Shape implements Perimeter {

    double r;
    double pie = 3.1416;

    @Override
    public double getPerimeter() {
        double perimeter = 2 * pie * r;
        return perimeter;
    }

    public Circle(float x, float y, double r, double pie) {
        super(x, y);
        this.r = r;
        this.pie = pie;
    }
}