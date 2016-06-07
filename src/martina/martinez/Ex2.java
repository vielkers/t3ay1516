package martina.martinez;

public class Ex2 {
  public static void main(String[] args) {

    // Exercise 1.1
    //int n = Integer.parseInt(args[0]);
    // Apply factorial to n
    // if n = 5, 5! = 120
    int a1 =0, a2 = 1, a3, i;
    System.out.println(a1 + " " + a2);
    for (i=2; i<9;i++) {
      a3 = a1 + a2;
      System.out.println(" " + a3);
      a1 = a2;
      a2 = a3;
    }

    // Exercise 1.2
    //int[] nums = {3, 5, 1, 35, 29, 22, 82, 86, 95, 72};
    // Print all the odd numbers inside the nums array

  }
}
