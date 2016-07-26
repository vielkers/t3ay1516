package macavinta.gianninah.ex8;

/**
 * Created by IE on 7/26/2016.
 */
public class circle {private boolean isUnitCircle;
    private float radius;

    public circle(float radius) {
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
