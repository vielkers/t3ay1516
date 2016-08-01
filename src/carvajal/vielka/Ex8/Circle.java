package carvajal.vielka.Ex8;

/**
 * Created by IE on 7/28/2016.
 */
public class Circle extends Shape implements Perimeter {
    private float y;
    private float x;
    private float radius;

    public float getY() {return y;}

    public void setY(float y) {
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }


    @Override
    public float getPerimeter() {
        return (float) (radius * 2 * 3.14);
    }
}