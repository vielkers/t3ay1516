package matthew.reyes;

public class Ex2
{
  public static void main(String[] args)
  {
    // Exercise 2.1
    // Implement fibonacci sequence
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
    int n1 = 0, n2 = 1, n3, i, count = 9;
    System.out.print(n1 + " " + n2);//printing 0 and 1

    for (i = 2; i < count; ++i)//loop starts from 2 because 0 and 1 are already printed
    {
      n3 = n1 + n2;
      System.out.print(" " + n3);
      n1 = n2;
      n2 = n3;
    }
    {
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


      System.out.println("\n \nThese are the Prime numbers from 1 to " +maxNumber);// Prints the Statement

      for (int p = 1; p<=maxNumber; p++) //Causes thecount to start from 1 and to stop once it reaches the maximum number
      {

        boolean primeNumber = true; //Introduces the boolean function and states the true value for prime numbers

        for (int d = 2; d < p; d++) //Indicates that d will increase by 1 as long as it is less than p
        {

          if (p % d == 0) { //Indicates that p will be divided by d and that if the resulting answer is zero, then the value for primeNumber will be false

            primeNumber = false;//see above

          }

        }

        if (primeNumber)
        {
          System.out.print(p + "\n"); //If statement stating that it will print the values of the numbers if Prime = true

        }
      }
    }
  }
}


