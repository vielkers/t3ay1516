package jason.lau;

public class Ex2 {
  public static void main(String[] args) {
    // Exercise 2.1
    // Implement fibonacci seuqence
    int a1 = 0, a2 = 1, a3, i, n = 9;
    System.out.printf(a1 + "  " + a2);
    for (i = 2; i < n; i++) {
      a3 = a1 + a2;
      System.out.printf("  " + a3);
      a1 = a2;
      a2 = a3;
    }

    // Exercise 2.2
    // Implement a primality test of numbers from 2 to maxNumber
    int maxNumber = 1000;
    System.out.println("\n");
    int prime, d;
    for (int x = 0; x <= maxNumber; x++) {
      prime = x; //states that 1 is prime
      for (d = 2; d <= (x - 1); d++) {
        if (x % d == 0) {
          prime = 0;
        }
      }
      if (prime != 0) {
        System.out.println(prime);
      }

    }
  }
}
