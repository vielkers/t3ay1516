package anton.santos.Ex8;

/**
 * Created by Anton on 7/30/2016.
 */

public class Circle extends Shape implements Perimeter {

    double rad;
    double pivalue = 3.14;

    @Override
    public double getPeri(){
        double peri = 2*pivalue*rad;
        return peri;
    }

    public Circle(float x, float y, double rad, double pivalue){
        super(x,y);
        this.rad = rad;
        this.pivalue = pivalue;
    }
}