package instructor.solutions;

public class Ex2 {
  public static void main(String[] args) {
    // Exercise 2.1
    // Implement fibonacci sequence
    int n = 9;
    // Use x1 = 0, x2 = 1 as starting variables
        // x3 = 1
        // x4 = 2
        // x5 = 3
        // x6 = 5
        // x7 = 8
        // x8 = 13
        // x9 = 21  (if n = 9, you should output 21)
    // Tips:
        // 1. Use int variables and loop of your choice (for, while, do-while)
        // 2. Equation form: Xn = Xn-1 + Xn-2
        // 3. You may need a variable to (a) hold current sum or (b) change values of the x's

    int x1 = 0, x2 = 1;
    int xn = 0;
    if (n <= 0) {
      System.out.println("Invalid argument. Should only be positive integer.");
    } else if (n == 1) {
      System.out.println("fibonacci(1) = " + 0);
    } else if (n == 2) {
      System.out.println("fibonacci(2) = " + 1);
    } else {
      for (int i = 3; i <= n; i++) {
        xn = x1 + x2;
        x1 = x2;
        x2 = xn;
      }
      System.out.println("fibonacci(" + n + ") = " + xn);
    }

    // Exercise 2.2
    // Implement a primality test of numbers from 2 to maxNumber
    int maxNumber = 1000;
    // A number x is prime iff x >= 2, and its only factors are 1 and itself
    // Tips:
        // 1. To check if a number d divides x: (x % d == 0)
            // x mod d == 0
            // Having 0 as modulo means d divides x fully
            // Example: 100 % 50 = 0 (since 100/50 = 2 r 0), so 50 divides 100 fully
            // Example: 97 % 12 = 1, so 12 does not divide 97 fully since there is remainder 1
        // 2. For a given number 2 <= x <= maxNumber, you don't need to test from 2 to maxNumber
            // d should be less than x (d < x)
            // Example: given 97, there is no need to check if 75 can divide it fully
            // Determine the max value of d that minimizes the number of division tests
        // 3. Optional: all even numbers except 2 are automatically not prime
            // 2 is the only even prime number
    for (int i = 2; i <= maxNumber; i++) {
      // If a number is fully divisible by 2, it is even
      // Even numbers (except 2) are all non-prime (or composite)
      // The logic inside the if-statement only runs if the number in question is 2, or odd
      if ((i == 2) || (i % 2 != 0)) {
        int prime = i;
        // No need to check from 2 to number being tested - 1
        // Checking from 2 up to the half of the number is sufficient
        // For more efficient checking (lesser numbers to be tested), (int)Math.sqrt(i) can be used
        for (int j = 2; j <= (i/2); j++) {
          // Having zero as modulo means j divides i, therefore i is not prime
          if (i % j == 0) {
            prime = 0;
          }
        }
        // If prime was not changed to zero, no number can divide i, therefore i is prime
        if (prime != 0) {
          System.out.println(prime);
        }
      }
    }
  }
}
