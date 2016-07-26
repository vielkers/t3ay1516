package aranguren.bernadette.Ex8;



public class Triangle extends Shape implements Perimeter {

    double a;
    double b;
    double c;

    public Triangle(double triaa, double triab, double triac)
    {
        shapeName = "Triangle";
        a = triaa;
        b = triab;
        c = triac;
    }

    public double computePerimeter()
    {
        return perimeter = a + b + c;
    }

}