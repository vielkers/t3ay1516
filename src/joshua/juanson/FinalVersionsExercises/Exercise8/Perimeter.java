package joshua.juanson.FinalVersionsExercises.Exercise8;
public class Perimeter
{
    public static void main(String args[])
    {
        Circle circles = new Circle(5f,3.14f);
        Triangle triangles = new Triangle(5,6,7);
        Shape shapes = new Shape(31.4f,18f);
        //Solve for Perimeter
        System.out.println("");
        System.out.println("PERIMETER FOR CIRCLE");
        System.out.println("Perimeter = 2*pi*radius");
        System.out.println("For a circle with: \nRadius = " + circles.getRadius() + "\nPi = " +circles.getPi());
        System.out.println("The perimeter is: " + shapes.getCirclePerimeter());
        System.out.println("\n\nPERIMETER FOR TRIANGLE");
        System.out.println("Perimeter = side 1 + side 2 + side 3");
        System.out.println("For a triangle with: \nSide 1 = " +triangles.getSide1() + "\nSide 2 = " +triangles.getSide2() +"\nSide 3 = " +triangles.getSide3());
        System.out.println("The perimeter is: " +shapes.getTrianglePerimeter());
    }
}
