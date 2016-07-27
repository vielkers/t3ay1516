package aranguren.bernadette.Ex8;

public class Test {

        public static void main(String args[]) {
            Circle circ = new Circle(15.0);
            Triangle tria = new Triangle(10, 12, 14);

            circ.computePerimeter();
            circ.shapeDisplay();
            tria.computePerimeter();
            tria.shapeDisplay();

        }
}
