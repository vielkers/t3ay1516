package martina.martinez.Ex8;

/**
 * Created by IE on 7/29/2016.
 */
public class Triangle {
    private boolean isUnitCircle;

    private float base;
    private float height;
    private float side;

    public Triangle(float base, float height, float side) {
        this.isUnitCircle = false;
        this.base = base;
        this.height = height;
        this.side = side;
    }

    public boolean IsUnitCircle()
    {
        return isUnitCircle;
    }

    public float getBase()
    {
        return base;
    }

    public void setBase(float base)
    {
        this.base = base;
    }

    public float getHeight()
    {
        return height;
    }

    public void setHeight(float height)
    {
        this.height = height;
    }

    public float getSide()
    {
        return side;
    }

    public void setZ(float side)
    {
        this.side = side;
    }
}
