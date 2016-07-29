package jason.lau.Ex8;

/**
 * Created by Jason on 7/26/2016.
 */
public class Shape {
    String name;
    protected Shape(String name) {
        this.name=name;
        }
    public Shape() {
        this("Shape is unspecified");
        }
    public String name() {
        return name;
        }
    public double per() {
        return 0.0;
        }
    public double area () {
        return 0.0;
        }

}

