package carvajal.vielka.Ex8;

/**
 * Created by IE on 7/28/2016.
 */
public class Triangle extends Shape implements Perimeter{
    private float a;
    private float b;
    private float c;


    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }

    @Override
    public float getPerimeter() {
        return (a + b + c);
    }
}
