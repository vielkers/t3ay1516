package arvin.ymson.Exercise8;

import arvin.ymson.Complete.*;

/**
 * Created by arvin_000 on 7/29/2016.
 */
public class Triangle extends Shape implements PerimeterInterface {
    public float first;
    public float second;
    public float third;

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

    public float getThird() {
        return third;
    }

    public void setThird(float third) {
        this.third = third;
    }

    @Override
    public float computePerimeter() {
        return first + second + third;
    }
}
