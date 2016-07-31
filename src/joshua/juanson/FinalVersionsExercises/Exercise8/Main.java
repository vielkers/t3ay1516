package joshua.juanson.FinalVersionsExercises.Exercise8;
public class Main {
    public static void main(String args[])
    {
        Perimeter per = new Perimeter() {
            @Override
            public double getPerimeter() {
                return 0;
            }
        };
        Triangle triangle1 = new Triangle(1f,2f,3f,4f,5f);
        Circle circle1 = new Circle (1f,2f,3,4);
        System.out.println("Perimeter of Circle: " + circle1.getPerimeter());
        System.out.println("Perimeter of Triangle: " + triangle1.getPerimeter());
    }
}
