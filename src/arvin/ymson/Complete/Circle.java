package arvin.ymson.Complete;

/**
 * Created by arvin_000 on 7/30/2016.
 */
public class Circle extends Shape implements PerimeterInterface {

    private float first;
    private float second;
    private float radius;

    public float getRadius(){
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getFirst() {
        return first;
    }

    public void setFirst(float first) {
        this.first = first;
    }

    public float getSecond() {
        return second;
    }

    public void setSecond(float second) {
        this.second = second;
    }

    @Override
    public float computePerimeter (){
        return (float) (2 * radius * 3.14);
    }
}
