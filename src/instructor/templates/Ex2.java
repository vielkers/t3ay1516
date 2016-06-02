package instructor.templates;

import java.util.Scanner;

public class Ex2 {
  public static void main(String[] args) {
    // Exercise 2.1
    // Implement fibonacci sequence
    int n = 1;
    Scanner sc = new Scanner(System.in);
    int prev, next, sum, count;
    System.out.println("EXERCISE 2.1");
    System.out.println("Fib series is until what number? ");
    count=sc.nextInt();
    prev=next=1;
    System.out.println("Fib Series: ");
    while (n<=count)
    {
      System.out.println(prev);
      sum=prev+next;
      prev=next;
      next=sum;
      n++;
    }
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

    // Exercise 2.2
    // Implement a primality test of numbers from 2 to maxNumber
    int maxNumber = 1000;
    int i = 0;
    int number = 0;
    String primeNum = "";

    for (i=1; i<=maxNumber ; i++)
    {
      int counter = 0;
      for (number = i; number>=1; number--)
      {
        if(i%number==0)
        {
          counter = counter + 1;
        }
      }
      if(counter==2)
      {
        primeNum = primeNum + i + " ";
      }
    }
    System.out.println("================================================");
    System.out.println("EXERCISE 2.2");
    System.out.println("Defined variable maxNumber is " +maxNumber);
    System.out.println("Prime numbers from 2 to " + maxNumber + " are:");
    System.out.println(primeNum);
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
  }
}
