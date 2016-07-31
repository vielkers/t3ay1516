package joshua.juanson.FinalVersionsExercises.Exercise8;

public class Triangle extends Shape implements Perimeter  {

    float side1;
    float side2;
    float side3;

    public Triangle(float x, float y, float side1, float side2, float side3) {
        super(x,y);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double getPerimeter() {
        double perimeter;
        perimeter = side1 + side2 + side3;
        return perimeter;
    }

    public float getSide1() {
        return side1;
    }

    public void setSide1(float side1) {
        this.side1 = side1;
    }

    public float getSide2() {
        return side2;
    }

    public void setSide2(float side2) {
        this.side2 = side2;
    }

    public float getSide3() {
        return side3;
    }

    public void setSide3(float side3) {
        this.side3 = side3;
    }
}
