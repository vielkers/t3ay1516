git stypackage jason.lau;

public class Ex1 {
  public static void main(String[] args) {

    // Exercise 1.1
    int N,f = 1;
    int n = Integer.parseInt(args[0]);
    // Apply factorial to n
    // if n = 5, 5! = 120

    for (N = 1; N <= n; N++)
      f = f * N;

    System.out.println("Factorial of" + n + "is =" + f);

    // Exercise 1.2
    //int[] nums = {3, 5, 1, 35, 29, 22, 82, 86, 95, 72};
    // Print all the odd numbers inside the nums array

  }
}
