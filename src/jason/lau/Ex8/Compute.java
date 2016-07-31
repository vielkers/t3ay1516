package jason.lau.Ex8;

/**
 * Created by Jason on 7/31/2016.
 */
public class Compute {
    public static void main(String args[])
        {
            Perimeter p = new Perimeter() {
                       @Override
                        public double getPerimeter() {
                                return 0;
                            }
                    };
                Triangle tri = new Triangle(15f,2f,23f,12f,43f);
                Circle circ = new Circle (12f,23f,5,53);
                System.out.println("Perimeters of: ");
                System.out.println("");
                System.out.println("Circle: " + circ.getPerimeter());
                System.out.println("Triangle: " + tri.getPerimeter());
            }


}
