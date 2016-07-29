package angelica.olan.Ex8;

/**
 * Created by IE on 7/29/2016.
 */
public class Circ extends Shape implements Perimeter {
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
