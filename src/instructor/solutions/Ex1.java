package instructor.solutions;

public class Ex1 {
  public static void main(String[] args) {

    // Exercise 1.1
    int n = Integer.parseInt(args[0]);
    int m = n;

    // Check if input is valid
    if (n <= 0) {
      System.out.println("Invalud number. Only positive nos. allowed.");
    } else {
      // Create a placeholder that will hold the result
      int currentProduct = 1;

      // When n becomes 1, stop the loop since x*1 = x
      // n >= 1 stillo produce same result, but iterates with additional one (useless) step
      while (n > 1) {
        // Start accumulation into currentProduct
        currentProduct = currentProduct * n;
        // Decrement n by 1
        n--;
      }

      // Print the value of currentProduct
      System.out.println(m + "! = " + currentProduct);
    }

    // Exercise 1.2
    int[] nums = {3, 5, 1, 35, 29, 22, 82, 86, 95, 72};
    // Print all the odd numbers inside the nums array

  }
}
