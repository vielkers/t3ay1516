package aguirre.erika;

// Exercise 2.2
// Implement a primality test of numbers from 2 to maxNumber

public class AguirreEx2pt2 {
    public static boolean isPrime1(int s) {
            if (s <= 1) {
                return false;
            }
            if (s == 2) {
                return true;
            }
            for (int i = 2; i <= Math.sqrt(s) + 1; i++) {
                if (s % i == 0) {
                    return false;
                }
            }
            return true;
        }
        public static boolean isPrime2(int s) {
            if (s <= 1) {
                return false;
            }
            if (s == 2) {
                return true;
            }
            if (s % 2 == 0) {
                return false;
            }
            for (int i = 3; i <= Math.sqrt(s) + 1; i = i + 2) {
                if (s % i == 0) {
                    return false;
                }
            }
            return true;
        }
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

}
