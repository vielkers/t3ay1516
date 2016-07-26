package ysai.bravo.Ex8;

/**
 * Created by IE on 7/26/2016.
 */
public class shape {
    String name;
    protected shape(String name) {
        this.name=name;
    }
    public shape() {
        this("Unspecified shape");
    }
    public String name() {
        return name;
    }
    public double perimeter() {
        return 0.0;
    }
    public double area () {
        return 0.0;
    }
}
