package carvajal.vielka.Ex8;

/**
 * Created by IE on 7/28/2016.
 */
public class Circle {private boolean isUnitCircle;
    private float radius;

    public Circle(float radius) {
        this.isUnitCircle = true;
        this.radius = radius;
    }

    public boolean IsUnitCircle() {
        return isUnitCircle;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }
}
