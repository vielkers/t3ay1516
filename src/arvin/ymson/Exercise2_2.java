package arvin.ymson;

import java.util.Scanner;

/**
 * Created by arvin_000 on 6/17/2016.
 */
public class Exercise2_2 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = x.nextInt();
        int maxNumber = 1000;
        boolean isPrime = true;

        for (int y = 2; y < n; y++) {
            if(n % y == 0){
                isPrime = false;
                break;
            }
            else{
                isPrime = true;
            }
        }
        if(isPrime == true){
            System.out.println("It's a prime!");
        }
        else{
            System.out.println("It's not a prime!!");
        }
    }
}
