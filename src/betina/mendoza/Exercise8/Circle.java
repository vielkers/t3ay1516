package betina.mendoza.Exercise8;

public class Circle extends Shape implements Perimeter {
    private float x;
    private float y;
    private float radius;

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public float getPeriemter() {
        return (float) (2 * radius * 3.14);
    }
}
