package joshua.juanson.FinalVersionsExercises.Exercise8;

public class Circle
{
    private float radius;
    private float pi;
    public Circle (float radius, float pi)
    {
        this.radius = radius;
        this.pi = 3.14f;
    }
    public float getRadius()
    {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getPi() {
        return pi;
    }

    public void setPi(float pi) {
        this.pi = pi;
    }
}
