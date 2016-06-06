package carvajal.vielka;

public class Ex2 {
  public static void main(String[] args) {
    // Exercise 2.1
    int n1 = 0,
        n2 = 1,
        n3,
        i,
        count = 9;

    System.out.print(n1 + " " + n2);
    for (i = 2; i < count; ++i)

    {
      n3 = n1 + n2;
      System.out.print(" " + n3);
      n1 = n2;
      n2 = n3;
    }


    // Exercise 2.2
    // Implement a primality test of numbers from 2 to maxNumber
    int maxNumber = 1000;
    System.out.println(" Prime Numbers between 1 and " +maxNumber);
    for (int l = 1; l<maxNumber; l++) {
      boolean isPrimeNumber = true;
      for (int j = 2; j < l; j++) {
        if (l % j == 0) {
          isPrimeNumber = false;
        }
      }
      if (isPrimeNumber) {
        System.out.print(l + " ");

      }
    }
  }
}
