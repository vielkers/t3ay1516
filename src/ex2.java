package keith.lim;

public class ex2 {
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

        int x1 = 0, x2 = 1, i, x3;

        System.out.println("x1=" + x1);
        System.out.println("x2=" + x2);

        for (i = 0; i < (n - 2); i++) {
            x3 = x2 + x1;
            System.out.println("x" + (i + 3) + "=" + x3);
            x1 = x2;
            x2 = x3;

        }

        System.out.println("\n");
        // Exercise 2.2
        // Implement a primality test of numbers from 2 to maxNumber

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
        int maxNumber = 1000;
        int prime = 0, j;
        for (i = 1; i <= maxNumber; i++) {
            prime = i;

            for (j = 2; j < (Math.sqrt(i)); j++) {

                if(i%j == 0) {
                    prime = 0;
                }

            }

            if (prime != 0) {
                System.out.println(prime);
            }
        }
    }
}