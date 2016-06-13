package instructor.lectures;

public class Arrays {
  public static void main(String[] args) {
    // Array Declaration
    int[] evenNos1;
    int evenNos2[];

    // Array assignment initialization
    evenNos1 = new int[5];
    evenNos2 = new int[5];

    // Array assignment initialization for objects
    Circle[] circlesArray1  = new Circle[10];
    Circle circlesArray2[] = new Circle[50];

    // Array declaration and initialization
    int[] numbers1 = new int[50];
    int numbers2[] = new int[93];

    // Declaration and Assignment
    int[] evenNos3 = new int[] {2, 4, 6, 8, 10, 12};
    int[] evenNos4 = {12, 14, 16, 18, 20, 22, 24};

    // Declaration and Assignment with Objects
    Circle[] circlesArray3 = new Circle[] {new Circle(10f, 20f), new Circle(15f, 18f), new Circle()};
    Circle[] circlesArray4 = {new Circle(7f, 2f), new Circle(5f, 9f)};

    // Assignment to existing array
    evenNos1[0] = 30;
    for (int i = 1; i < 5; i++) {
      evenNos1[i] = 40*i;
    }

    // Assigning array to an array
    evenNos2 = evenNos1;
    circlesArray1 = circlesArray3;

    // Arrays are objects
    evenNos1[2] = 1000;
    System.out.println(evenNos1[2]);
    System.out.println(evenNos2[2]);

    // Getting size of an array
    System.out.println("Even Nos 1 Array Size: " + evenNos1.length);
    System.out.println("Even Nos 2 Array Size: " + evenNos2.length);
    System.out.println("Even Nos 3 Array Size: " + evenNos3.length);
    System.out.println("Even Nos 4 Array Size: " + evenNos4.length);
    System.out.println("Circles Array 1 Size: " + circlesArray1.length);
    System.out.println("Circles Array 2 Size: " + circlesArray2.length);
    System.out.println("Circles Array 3 Size: " + circlesArray3.length);
    System.out.println("Circles Array 4 Size: " + circlesArray4.length);

    // Using foreach loop
    for(Circle circle : circlesArray1) {
      System.out.println("Area:" + circle.getArea());
      System.out.println("Circumference: " + circle.getCircumference());
    }

    // Arrays are IMMUTABLE
    evenNos1[5] = 12;
    // This produces a runtime error because evenNos1 is an array made to contain 5 elements
    // evenNos1[5] is the sixth element (arrays start at 0)
  }
}
