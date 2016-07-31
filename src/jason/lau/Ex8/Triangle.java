package jason.lau.Ex8;

/**
 * Created by Jason on 7/26/2016.
 */
public class Triangle extends Shape implements Perimeter  {

    float h;
    float b;
    float hypo;

    public Triangle(float x, float y, float Height, float Base, float hypotenuse) {
        super(x,y);
        this.h = Height;
        this.b = Base;
        this.hypo = hypotenuse;
    }

    @Override
    public double getPerimeter() {
        double perimeter;
        perimeter = h + b + hypo;
        return perimeter;
    }
    public float getH() {
        return h;
    }

    public void setH(float h) {
        this.h = h;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getHypo() {
        return hypo;
    }

    public void setHypo(float hypo) {
        this.hypo = hypo;
    }

}
