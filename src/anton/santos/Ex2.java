package anton.santos;

public class Ex2 {
  public static void main(String[] args) {
    // Exercise 2.1
    // Implement fibonacci sequence
    int n1 = 0, n2 = 1, n3, i, count = 10;
    System.out.println("Fibonacci Start");
    System.out.println(n1);
    System.out.println(n2);
    for (i = 2; i < count; ++i)//loop starts from 2 because 0 and 1 are already printed
    {
      n3 = n1 + n2;
      System.out.println(n3);
      n1 = n2;
      n2 = n3;
    }
    //Exercise 2.2
    //Implement Primality Check
    System.out.println("Primality Start");

    int maxNumber = 1000;
    int x, y;
    int prime = 0;
    for (x = 1; x <= maxNumber; ++x) {
      prime = x;
      for (y = 2; y < x; y++) {
        if (x % y == 0) {
          prime = 0;
        }
      }
      if (prime != 0) {
        System.out.println(prime);
      }
    }
  }

}


