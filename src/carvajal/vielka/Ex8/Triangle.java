package carvajal.vielka.Ex8;

/**
 * Created by IE on 7/28/2016.
 */
public class Triangle {private boolean isUnitCircle;
    private float side;
    private float height;
    private float base;

    public Triangle(float side, float height, float base) {
        this.isUnitCircle = false;
        this.side = side;
        this.height = height;
        this.base = base;


    }

    public boolean IsUnitCircle() {
        return isUnitCircle;
    }

    public float getSide() {
        return side;
    }

    public void setZ(float side) {
        this.side = side;
    }
    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }


    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }
}
