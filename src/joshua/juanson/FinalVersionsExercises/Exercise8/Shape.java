package joshua.juanson.FinalVersionsExercises.Exercise8;
public class Shape
{
    private float circlePerimeter, trianglePerimeter;
    Circle circle1 = new Circle(5f, 3.14f);
    Triangle triangle1 = new Triangle(5,6,7);
    public Shape (float circlePerimeter, float trianglePerimeter)
    {
        this.circlePerimeter=circle1.getRadius()*2*circle1.getPi();
        this.trianglePerimeter=triangle1.getSide1()+triangle1.getSide2()+triangle1.getSide3();
    }
    public float getCirclePerimeter()
    {
        return circlePerimeter;
    }

    public void setCirclePerimeter(float circlePerimeter) {
        this.circlePerimeter = circlePerimeter;
    }

    public float getTrianglePerimeter() {
        return trianglePerimeter;
    }

    public void setTrianglePerimeter(float trianglePerimeter) {
        this.trianglePerimeter = trianglePerimeter;
    }
}


