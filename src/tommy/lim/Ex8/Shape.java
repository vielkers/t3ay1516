package tommy.lim.Ex8;

/**
 * Created by IE on 7/29/2016.
 */
public class Shape {
    String word;
    protected Shape(String word) {
        this.word = word;
    }
    public Shape() {
        this("The shape is unspecified");
    }
    public String word() {
        return word;
    }
    public double Perimeter() {
        return 0.0;
    }
    public double Area() {
        return 0.0;
    }
}
