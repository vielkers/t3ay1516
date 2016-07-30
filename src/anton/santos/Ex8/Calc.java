package anton.santos.Ex8;
/**
 * Created by Anton on 7/30/2016.
 */
public class Calc {
    public static void main(String args[]){

        Triangle tri = new Triangle(0f,0f,33f,34f,35f);
        Circle circ = new Circle(0f,0f,15f,3.14f);
        double triperi = tri.getPeri();
        double circperi = circ.getPeri();

        System.out.println("Triangle Perimeter = "+triperi);
        System.out.println("Circle Perimeter = "+circperi);


    }


}
